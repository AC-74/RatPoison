package rat.poison.scripts.aim

import rat.poison.curSettings
import rat.poison.game.entity.isScoped
import rat.poison.game.me
import rat.poison.strToBool
import rat.poison.utils.pathAim

fun pathAim() = aimScript(curSettings["AIM_DURATION"].toInt(), { curSettings["ENABLE_PATH_AIM"].strToBool() }) { dest, current, aimSpeed ->
	pathAim(current, dest, aimSpeed,
			sensMultiplier = if (me.isScoped()) 1.0 else curSettings["AIM_STRICTNESS"].toDouble(),
			perfect = perfect.getAndSet(false))
}