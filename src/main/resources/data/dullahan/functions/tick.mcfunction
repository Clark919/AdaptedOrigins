#Nightmare steed
execute at @a as @e[type=skeleton_horse,tag=steed] if score @s[distance=15..] nightmareID = @p nightmareID run tp @s ~.3 ~ ~
execute at @e[type=skeleton_horse,tag=steed] run particle soul_fire_flame ~ ~1 ~ .7 .8 .7 0.01 1