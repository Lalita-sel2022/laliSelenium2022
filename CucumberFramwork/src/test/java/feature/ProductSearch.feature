Feature: Search and plce the order for product

Scenario Outline: Search experience for product search in both home and offers page
Given: User is on greenKart lending page
When: User serach with short name <name> and get the actual name of product
Then: User serached for same name in offer page to check if product exist
And: Validate the product name in offers page match with lending page

Examples:
|name|
|beet|
|tom|
|pat|