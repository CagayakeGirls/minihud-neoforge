<center><div align="center">

<img height="100" src="src/main/resources/icon.png" width="100"/>

# BoccHUD for NeoForge

MiniHUD unofficial NeoForge port.

<img alt="neoforge" height="56" src="https://raw.githubusercontent.com/KessokuTeaTime/badges-extra/main/assets/cozy/supported/neoforge_vector.svg">

<a href="https://modrinth.com/mod/mafglib">
<img alt="modrinth" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/modrinth_vector.svg">
</a>
<a href="https://www.curseforge.com/minecraft/mc-mods/mafglib">
<img alt="curseforge" height="56" src="https://cdn.jsdelivr.net/npm/@intergrav/devins-badges@3/assets/cozy/available/curseforge_vector.svg">
</a>

</div></center>

BoccHUD is a tiny client-side mod for NeoForge. that adds the coordinates, looking angle and current speed to the screen.

[Original Repo Readme](Original-README.md)

## Development

This mod use modrinth maven.

```gradle
repositories {
    maven { url 'https://api.modrinth.com/maven' }
}

dependencies {
    modImplementation "maven.modrinth:bocchud:${bocchud_version}"
}
```

or use KessokuTeaTime maven (only 0.4.1 and above)

```gradle
repositories {
    maven { url 'https://maven.kessokuteatime.work/releases' }
}

dependencies {
    modImplementation "team.cagayakegirls.bocchud:bocchud:${bocchud_version}"
}
```

> Note: "${bocchud_version}" can be found in [Modrinth](https://modrinth.com/mod/bocchud)

## Compiling
- Clone the repository
- Open a command prompt/terminal to the repository directory
- run 'gradlew build'
- The built jar file will be in build/libs/

## Credits
- [maruohon/minihud](https://github.com/maruohon/minihud)
- [sakura-ryoko/minihud](https://github.com/sakura-ryoko/minihud)