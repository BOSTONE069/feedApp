# FEEDAPP SOCIAL MEDIA WEB APPLICATION
FeedApp is a robust social media application that provides a platform for users to share various types of content such as text, images, and more. These pieces of content, referred to as "feeds," form the core of the user's interaction within the application. Users can not only post their feeds but also engage with other users' content by liking or commenting on them

# Table of Contents
- [Installation](#Installation)
- [SignUp](#SignUp)
- [Verify Email](#Verify Email)
- [Login](#Login)
- [Update User Profile](#Update User Profile)
- [View All Feeds from Other Users](#View All Feeds from Other Users)
- [View My Feeds](#View My Feeds)
- [User Interactions: Likes and Comments](#User Interactions: Likes and Comments)
- [Database Interactions and Pages for Our Features](#Database Interactions and Pages for Our Features)
- [License](#License)

# Features
# SignUp
Our users will be able to sign up to use the FeedApp, but we will also be sending them a verification email and checking to ensure that they do exist. To do so, we'll use JSON Web Tokens, one of the most important and widely-used security measures in web technology today. 
# Verify Email
Before users can log in and write posts, they'll need to verify their emails with us.

# Reset Password
If a user needs to reset their password, we'll facilitate the process by emailing and using JWTs to authenticate their access. 

# Login
When users log in, we'll create a JWT session token for them, then use Spring Security to check the details before giving them access.

# Update User Profile
Users can update their profile in three ways: updating their basic profile text, changing their profile picture, or cropping their picture. They can also change their passwords.

# Add a Feed
Users can add a new feed post with written content and an optional image.

# View All Feeds from Other Users
View feeds of all the users, including images and written content. They can also apply pagination to the posts. We'll implement a "pull to refresh" feature to optimize the speed for first-time page loads.

# View My Feeds
Users can view their feeds and see who liked and commented on them.

# User Interactions: Likes and Comments
Users can like and comment on their feeds and the feeds of others.

# Database Interactions and Pages for Our Features
To facilitate the features above,  writing end-points and the related business logic to ensure access the databases was done.

# License
This project is licensed under the [MIT License](#https://www.mit.edu/~amini/LICENSE.md).
