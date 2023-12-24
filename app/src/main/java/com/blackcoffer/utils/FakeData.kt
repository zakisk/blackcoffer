package com.blackcoffer.utils

data class User(
    val id: Int,
    val name: String,
    val location: String,
    val within: Int,
    val hobbies: List<String>,
    val description: String,
    val isInvited: Boolean,
    val profileImage: String
)

val fakeUsers = listOf(
    User(
        1,
        "John Smith",
        "New York",
        5,
        listOf("Reading", "Traveling", "Photography"),
        "I love exploring new places.",
        true,
        "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&w=600"
    ),
    User(
        2,
        "Alice Johnson",
        "San Francisco",
        10,
        listOf("Hiking", "Cooking", "Painting"),
        "Passionate about outdoor activities.",
        false,
        "https://images.pexels.com/photos/2379004/pexels-photo-2379004.jpeg"
    ),
    User(
        3,
        "Bob Davis",
        "Los Angeles",
        8,
        listOf("Photography", "Gaming", "Programming"),
        "Tech enthusiast and gamer.",
        true,
        "https://images.pexels.com/photos/1043474/pexels-photo-1043474.jpeg?cs=srgb&amp;dl=pexels-chloe-1043474.jpg&amp;fm=jpg"
    ),
    User(
        4,
        "Eva White",
        "Chicago",
        15,
        listOf("Yoga", "Painting", "Reading"),
        "Artistic soul with a love for yoga.",
        false,
        "https://images.pexels.com/photos/1222271/pexels-photo-1222271.jpeg"
    ),
    User(
        5,
        "Michael Brown",
        "Miami",
        3,
        listOf("Swimming", "Dancing", "Cooking"),
        "Enjoying the beach life.",
        true,
        "https://images.pexels.com/photos/775358/pexels-photo-775358.jpeg"
    ),
    User(
        6,
        "Olivia Lee",
        "Seattle",
        7,
        listOf("Coding", "Music", "Reading"),
        "Software engineer with a passion for music.",
        false,
        "https://images.pexels.com/photos/1300402/pexels-photo-1300402.jpeg"
    ),
    User(
        7,
        "Daniel Miller",
        "Austin",
        12,
        listOf("Cycling", "Reading", "Running"),
        "Nature lover and avid reader.",
        true,
        "https://images.pexels.com/photos/1136575/pexels-photo-1136575.jpeg"
    ),
    User(
        8,
        "Sophia Wilson",
        "Denver",
        6,
        listOf("Running", "Movies", "Painting"),
        "Fitness enthusiast and movie buff.",
        false,
        "https://images.pexels.com/photos/614810/pexels-photo-614810.jpeg"
    ),
    User(
        9,
        "Matthew Moore",
        "Portland",
        9,
        listOf("Cooking", "Traveling", "Photography"),
        "Exploring the culinary world.",
        true,
        "https://images.pexels.com/photos/874158/pexels-photo-874158.jpeg"
    ),
    User(
        10,
        "Emily Davis",
        "Phoenix",
        4,
        listOf("Photography", "Shopping", "Dancing"),
        "Capturing moments through a lens.",
        false,
        "https://images.pexels.com/photos/91227/pexels-photo-91227.jpeg"
    ),
    User(
        11,
        "William Taylor",
        "San Diego",
        11,
        listOf("Hiking", "Painting", "Running"),
        "Outdoor activities and art lover.",
        true,
        "https://images.pexels.com/photos/1121796/pexels-photo-1121796.jpeg"
    ),
    User(
        12,
        "Ava Johnson",
        "Dallas",
        8,
        listOf("Swimming", "Writing", "Reading"),
        "Writing stories and swimming.",
        false,
        "https://images.pexels.com/photos/670720/pexels-photo-670720.jpeg"
    ),
    User(
        13,
        "James Harris",
        "Houston",
        14,
        listOf("Gaming", "Camping", "Programming"),
        "Gamer and nature enthusiast.",
        true,
        "https://images.pexels.com/photos/1172207/pexels-photo-1172207.jpeg"
    ),
    User(
        14,
        "Isabella Anderson",
        "Philadelphia",
        5,
        listOf("Dancing", "Movies", "Photography"),
        "Passionate about dance and film.",
        false,
        "https://images.pexels.com/photos/846741/pexels-photo-846741.jpeg"
    ),
    User(
        15,
        "Benjamin Martinez",
        "Detroit",
        10,
        listOf("Reading", "Cooking", "Hiking"),
        "Bookworm and amateur chef.",
        true,
        "https://images.pexels.com/photos/709188/pexels-photo-709188.jpeg"
    ),
    User(
        16,
        "Mia Thompson",
        "Minneapolis",
        7,
        listOf("Yoga", "Traveling", "Dancing"),
        "Yoga practitioner and wanderlust.",
        false,
        "https://images.pexels.com/photos/1043473/pexels-photo-1043473.jpeg"
    ),
    User(
        17,
        "Logan Garcia",
        "Atlanta",
        13,
        listOf("Running", "Photography", "Gaming"),
        "Running and capturing moments.",
        true,
        "https://images.pexels.com/photos/715546/pexels-photo-715546.jpeg"
    ),
    User(
        18,
        "Emma Thomas",
        "Raleigh",
        6,
        listOf("Coding", "Music", "Reading"),
        "Coding and exploring different music genres.",
        false,
        "https://images.pexels.com/photos/1183266/pexels-photo-1183266.jpeg"
    ),
    User(
        19,
        "Alexander Brown",
        "Charlotte",
        9,
        listOf("Gaming", "Hiking", "Photography"),
        "Gamer and outdoor adventurer.",
        true,
        "https://images.pexels.com/photos/834863/pexels-photo-834863.jpeg"
    ),
    User(
        20,
        "Charlotte Davis",
        "Tampa",
        4,
        listOf("Swimming", "Reading", "Dancing"),
        "Enjoying the sunshine and reading books.",
        false,
        "https://images.pexels.com/photos/927022/pexels-photo-927022.jpeg"
    )
)

