Feature: API Tests

  Scenario: Get post by ID
    Given the API is available
    When I request the post with ID 1
    Then I should get a response with status code 200
    And the userId should be 1

  Scenario: Get all posts
    Given the API is available
    When I request all posts
    Then I should get a response with status code 200
    And the number of posts should be 100

  Scenario: Get comments for a post
    Given the API is available
    When I request comments for post ID 1
    Then I should get a response with status code 200
    And the first comment should have postId 1