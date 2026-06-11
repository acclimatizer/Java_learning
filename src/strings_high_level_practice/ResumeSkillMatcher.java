package strings_high_level_practice;

import java.util.*;

class ResumeSkillMatcher {

    public static void main(String[] args) {

        String resume = """
                Experienced Java Full Stack Developer with Spring Boot,
                REST API, Microservices, AWS, Docker, Kubernetes,
                SQL, Hibernate, React, and CI/CD experience.
                """;

        String jobDescription = """
                Looking for Java Developer with strong Spring Boot,
                Microservices, AWS, Docker, Kafka, SQL, and REST API skills.
                """;

        String[] requiredSkills = {
                "Java", "Spring Boot", "Microservices", "AWS",
                "Docker", "Kafka", "SQL", "REST API"
        };

        resume = resume.toLowerCase();
        jobDescription = jobDescription.toLowerCase();

        List<String> matchedSkills = new ArrayList<>();
        List<String> missingSkills = new ArrayList<>();

        for (String skill : requiredSkills) {

            String normalizedSkill = skill.toLowerCase();

            if (resume.contains(normalizedSkill)) {
                matchedSkills.add(skill);
            } else {
                missingSkills.add(skill);
            }
        }

        double matchPercentage =
                (matchedSkills.size() * 100.0) / requiredSkills.length;

        System.out.println("Matched Skills: " + matchedSkills);
        System.out.println("Missing Skills: " + missingSkills);
        System.out.println("Resume Match: " + String.format("%.2f", matchPercentage) + "%");

        if (matchPercentage >= 75) {
            System.out.println("Good match for this job");
        } else {
            System.out.println("Resume needs improvement");
        }
    }
}