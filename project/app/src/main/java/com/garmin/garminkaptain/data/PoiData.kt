package com.garmin.garminkaptain.data

data class PointOfInterest(
    val id: Long,
    val mapLocation: MapLocation,
    val name: String,
    val poiType: String,
    val reviewSummary: ReviewSummary,
    val reviewsList: List<Review>
)

data class MapLocation(
    val latitude: Double,
    val longitude: Double
)

data class ReviewSummary(
    val averageRating: Double,
    val numberOfReviews: Int
)

data class Review(
    val id: Long,
    val userName: String,
    val text: String,
    val rating: Double
)
val reviewList: List<List<Review>> = listOf(
    listOf(
        Review(0, "costel", "great place!",3.0),
        Review(1, "mike", "i love it", 5.0)
    ),
    listOf(
        Review(2, "dana", "great place!",5.0),
        Review(3, "adam", "i love it", 5.0),
        Review(4, "costel", "great place!",5.0),
        Review(5, "mike", "i love it", 5.0)
    ),
    listOf(
        Review(6, "emily", "i hate it",1.0),
        Review(7, "adam", "wek", 1.0)
    ),
    listOf(
        Review(8, "rares", "It’s a bridge. It’s covered in fog. It’s pointless. Buy a postcard you will see more",0.0),
    ),
    listOf(
        Review(9, "dana", "great place!",3.0),
        Review(10, "adam", "meh", 3.0)
    ),
    listOf(
        Review(11, "dana", "great place!",3.0),
        Review(12, "rapsodia", "A great neighborhood dive. Tucked back into the marina, you'd never know it was there if it weren't for the live music! Popular with the locals, young and old alike. They always have live music and good drink prices! Plus I've heard their burgers are to die for. They do tend to have a cover charge on weekends!", 5.0),
        Review(13, "costel", "great place!",3.0),
        Review(14, "mike", "i love it", 5.0),
        Review(15, "mike", "pretty place", 2.3)
    ),
    listOf(
        Review(16, "dana", "Nice mooring field. Bring two long lines to loop through the front and aft buoys. World class views. A short sail from the city but feels like a different world.",3.0),
        Review(17, "rapsodia", "Clearly the best and most entertaining place to moor your boat over the weekend.  Come early if you want a place to moor for the night or tie up for the day.", 5.0),
        Review(18, "costel", "It is surgy and might be cold at times but the views and surroundings can compete with the best places in the world. Sunset walk around Angel Island will tell you the story.",3.0),
        Review(19, "mike", "Sheltered cove with daytime docks and an overnight mooring field.  State Park so all use is for a fee.  Great access to the island.  Snack bar operates in the summertime." , 5.0),
        Review(20, "mike", "pretty place", 2.3),
        Review(21, "dana", "great place!",3.0),
        Review(22, "rapsodia", "Clearly the best and most entertaining place to moor your boat over the weekend.  Come early if you want a place to moor for the night or tie up for the day.", 5.0),
        Review(23, "costel", "great place!",3.0),
        Review(24, "mike", "i love it", 5.0),
        Review(25, "mike", "pretty place", 2.3),
        Review(26, "dana", "great place!",3.0),
        Review(27, "rapsodia", "Clearly the best and most entertaining place to moor your boat over the weekend.  Come early if you want a place to moor for the night or tie up for the day.", 5.0),
        Review(28, "costel", "great place!",3.0),
        Review(29, "mike", "i love it", 5.0),
        Review(30, "mike", "pretty place", 2.3),
        Review(31, "dana", "great place!",3.0),
        Review(32, "rapsodia", "Clearly the best and most entertaining place to moor your boat over the weekend.  Come early if you want a place to moor for the night or tie up for the day.", 5.0),
        Review(31, "dana", "great place!",3.0)
    )
)

val poiList: List<PointOfInterest> = listOf(
    PointOfInterest(
        46067,
        MapLocation(37.8180564724432, -122.52704143524173),
        "Point Bonita",
        "Anchorage",
        ReviewSummary(3.2, 2),
        reviewList[0]
    ),
    PointOfInterest(
        12975,
        MapLocation(37.8770892291283, -122.503309249878),
        "Richardson Bay Marina",
        "Marina",
        ReviewSummary(5.0, 4),
        reviewList[1]
    ),
    PointOfInterest(
        46085,
        MapLocation(37.82878469060811, -122.47633210712522),
        "Needles",
        "Anchorage",
        ReviewSummary(1.0, 2),
        reviewList[2]
    ),
    PointOfInterest(
        19637,
        MapLocation(37.82077, -122.4786),
        "Golden Gate Bridge",
        "Bridge",
        ReviewSummary(0.0, 1),
        reviewList[3]
    ),
    PointOfInterest(
        60928,
        MapLocation(37.8325155338083, -122.47500389814363),
        "Horseshoe Cove",
        "Anchorage",
        ReviewSummary(3.0, 2),
        reviewList[4]
    ),
    PointOfInterest(
        39252,
        MapLocation(37.833886767314, -122.475371360779),
        "Presidio Yacht Club",
        "Marina",
        ReviewSummary(3.0, 5),
        reviewList[5]
    ),
    PointOfInterest(
        25644,
        MapLocation(37.8673327691044, -122.435932159424),
        "Ayala Cove",
        "Anchorage",
        ReviewSummary(4.7, 18),
        reviewList[6]
    ),
    PointOfInterest(
        61865,
        MapLocation(37.850002964208095, -122.41632213957898),
        "Tide Rips",
        "Hazard",
        ReviewSummary(0.0, 0),
        listOf()
    ),
    PointOfInterest(
        46713,
        MapLocation(37.827799573006274, -122.42648773017541),
        "Dangerous Rock",
        "Hazard",
        ReviewSummary(0.0, 0),
        listOf()
    ),
    PointOfInterest(
        57109,
        MapLocation(37.87572310328571, -122.50570595169079),
        "Woodrum Marine Boat Repair/Carpentry",
        "Business",
        ReviewSummary(0.0, 0),
        listOf()
    )
)