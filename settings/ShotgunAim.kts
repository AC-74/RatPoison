import rat.poison.settings.*

///////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////// --- GENERAL --- ///////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

//Enable flat aim
//Writes to angles ingame
SHOTGUN_ENABLE_FLAT_AIM = false

//Enable path aim
//Uses mouse movement to aim
SHOTGUN_ENABLE_PATH_AIM = true

//Factor recoil when shooting
SHOTGUN_FACTOR_RECOIL = false

//Aim Bone
//Default bone to aim at
SHOTGUN_AIM_BONE = -1

//Aim FOV
//Aims at entities inside this value
SHOTGUN_AIM_FOV = 50

//Aim speed
//MS delay between aiming steps
//Lower is faster
SHOTGUN_AIM_SPEED = 1

//Aim smoothness
//Lower is less smooth (faster snapping)
SHOTGUN_AIM_SMOOTHNESS = 1.0

//Aim strictness (1.0 - 5.0)
//Lower is more strict (faster, more accurate snapping)
SHOTGUN_AIM_STRICTNESS = 1.0


///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////// --- PERFECT AIM --- /////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

//Enable perfect aim
//Will instantly snap to the aimbone
SHOTGUN_PERFECT_AIM = false

//Perfect aim fov (0 - 45)
SHOTGUN_PERFECT_AIM_FOV = 1

//Perfect aim % chance to activate (1 - 100)
SHOTGUN_PERFECT_AIM_CHANCE = 1
