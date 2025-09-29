# Spring Security Fundamentals - Security Integration Tests - Part 2

This project is based on **Lesson 22 - Security Integration Tests - Part 2**
the [Spring Security Fundamentals](https://www.youtube.com/playlist?list=PLEocw3gLFc8X_a8hGWGaBnSkPFJmbb8QP) tutorial
series by **Laur Spilca** on YouTube.

## 📚 Tutorial Reference

- **Author:** Laur Spilca
- **Series:** Spring Security Fundamentals
- **Lesson:** Security Integration Tests - Part 2
- **Link:** [Watch on YouTube](https://www.youtube.com/watch?v=onD_fyhy58o)

## 🛠️ What I Did

This project was implemented as part of my learning journey with Spring Security. I followed the tutorial closely and:

- Recreated the project from scratch in my local environment.
- Set up comprehensive integration tests for Spring Security configurations using Spring Boot Test framework.
- In achieving this, the following concepts were implemented:
    - Implemented HTTP Basic Authentication with BCrypt password encryption and role-based access control for REST
      endpoints;
    - Authorization Testing: Created integration tests using MockMvc to verify that endpoints correctly enforce
      authority requirements (users without "read" authority are denied access);
    - Security Context Simulation: Used @WithMockUser annotations to test authorization rules independently from
      authentication, validating that protected endpoints return appropriate HTTP status codes (403 Forbidden vs 200 OK)

