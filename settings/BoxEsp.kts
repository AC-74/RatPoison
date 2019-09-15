import rat.poison.game.Color
import rat.poison.settings.*

//Enable box esp
ENABLE_BOX_ESP = false

//Enable box esp details
//Shows optional extra details (Health/Armor bar, Name/Weapon text) for each enemy, configurable below
BOX_ESP_DETAILS = false

//Enable box esp health bar; Bar position (L)eft / (R)ight
BOX_ESP_HEALTH = true
BOX_ESP_HEALTH_POS = "L"

//Enable box esp armor bar; Bar position (L)eft / (R)ight
BOX_ESP_ARMOR = true
BOX_ESP_ARMOR_POS = "R"

//Enable box esp name text; Text position (T)op / (B)ottom
BOX_ESP_NAME = true
BOX_ESP_NAME_POS = "T"

//Enable box esp weapon text; Text position (T)op / (B)ottom
BOX_ESP_WEAPON = true
BOX_ESP_WEAPON_POS = "B"

//Enable box esp on teammates
BOX_SHOW_TEAM = false

//Enable box esp on enemies
BOX_SHOW_ENEMIES = true

//Enable box esp on defuse kits
BOX_SHOW_DEFUSERS = true

//Color of your teammates
BOX_TEAM_COLOR = Color(red=0, green=0, blue=255, alpha=1.0)

//Color of your enemies
BOX_ENEMY_COLOR = Color(red=255, green=0, blue=0, alpha=0.6)

//Color of the defuse kit
BOX_DEFUSER_COLOR = Color(red=145, green=0, blue=90, alpha=1.0)
