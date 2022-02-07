# L'orienté objet, c'est quoi ? <br><br>

### Version très simplifiée !<br>

Pour ceux qui on coder en `C` pour, imaginez un objet comme une structure, sauf que vous pouvez y implémenter directement des fonctions à l'intérieur.<br><br>

Prenons un **appareil électronique lambda**, ce dernier pour fonctionner a besoins d'une `batterie`, d'ou il tire l'électricitée pour fonctionner.<br>
Cet appareil peut être chargé, faire des demandes en énergie, ou envoyer des signaux.<br>
Ensuite, prenons un téléphone, ce dernier **est** un appareil électronique, dans ce cas la, nous pouvons fusioner les deux classe pour crée une classe téléphone, possédants les attribut d'un appareil électronique.<br><br>

Pour avoir un exemple de code, regardez les fichier suivants: <br><br>

- [Déclaration d'une classe basique](./exemple/Battery.java)
- [Ajout d'une classe dans une autre objet](./exemple/Electronic.java)
- [Héritage d'une classe vers une autre](./exemple/Phone.java)<br><br>

## A savoir <br><br>

Pour compiler votre plugin, utilisez la commande `mvn package` a la racine du repository, il est déjà pré-rempli, mais **n'oubliez pas de modifier le sourceDirectory**, il se trouve tout en bas du [pom.xml](./pom.xml)<br><br>
Après chaque compilation, n'oubliez pas de déplacer le `.jar` de `./target` dans
le dossier `../server/plugin`, puis effectuez la commande `/reload confirm` sur le serveur.

## La configuration <br><br>

Configurez correctement votre [pom.xlm](./pom.xml) et votre [plugin.yml](./plugin.yml), il sont déjà pré-compléter, vous avez juste a modifier les valeurs pour customiser un peu.<br><br>

## Le premier test ! <br><br>

Une fois tout ça configurer, voyons voir si cela fonctionne, utilisez `mvn package` pour compiler,<br>
ensuite allez dans le dossier `mavenbuild` qui a été créer. Dans ce dernier vous trouverez<br>
votre `.jar`, déplacez le dossier `server/plugins` (si il n'y est pas, lancez le serveur avec un des scripts `start`).<br><br>

Une fois cela fait, lancez votre jeu en 1.18.1, puis dans le panneau **multijoueur** cliquez sur **connection rapide**<br>
et entrez `localhost`, vous devrez reussir a entrer en jeu, mettez vous opérateur grace a la commande<br>
`op <Player>` sur votre terminal qui est en charge du serveur, puis en jeu lancez la commande `/pl` dnas le chat<br>
Si vous avez 0 plugin, utilisez `/reload confirm`, puis refaites la commande `/pl` si c'est toujours 0, il y a **une erreur dans votre console** ! <br>
Une fois que vous voyez votre plugin en jeu, continuez.<br><br>

## Hello... player ? <br><br>

Maintenant la partie sérieuse !<br>
Spigot est une librairie qui permet d'injecter du code grace a ce qu'on appelle des `eventListeners` ou plus court `Listener`<br>
Pour commencer dans le dossier `src` éditez le fichier **myListener.java**, pour vous, elle est déjà déclarée et hérite déjà du bon élément<br>
Créez un event dans cette classe, cet event sera *hook* sur l'event de connection et evera `Hello <nom du joueur>` a ce dernier<br>
Hésitez pas a ajouter des couleurs pour faire plus joli ;)<br><br>

## Ping pong <br> <br>

Maintenant que vous savez créer un event handler de base, nous allons faire notre première commande <br>
dans votre fichier [plugin.yml](./plugin.yml) ajoutez la commande "ping", une fois exécutée elle renvéra<br>
"pong" au joueur l'ayant utilisée. liez la commande a une classe qui hérite de `CommandExecutor`. <br>
une fois cela fais, dans la fonction `onEnable()` de votre main rajoutez un executor a votre commande, recompilez votre plugin et testez la ! <br>

## Un plugin statique <br> <br>

Votre classe main ne peut être instanciée que une seule fois dans le programme <br>
De préférence nous allons donc stocker nos données avec des variables statiques `static` <br>
Pour que ces dernières soient accéssibles partout sans a instancier une nouvelle classe. <br>
De plus, les HashMaps sont souvent utilisées pour stocker des informations sur les joueurs <br><br>

Dans cet exercice, créez un event qui compte le nombre de fois qu'un joueur a sauter <br>
puis, stockez ce nombre dans une `static public Hashmap<UUID, Integer>` dans votre classe main <br>
changez l'utilitée de la commande ping pour qu'elle donne le nombre de saut effectuer par l'exécuteur <br><br>

## L'homme invincible !<br><br>

Maintenant que vous avez compris comment faire une commande et un listener, combinez les deux !<br>
Une fois que le joueur aura exécuter la commande `/invincible` tout les events de dégâts contre lui<br>
seront annuler, le rendant totalement invincible !<br>

<details>
    <summary>Indice</summary>
<br>
Modifiez le fichier plugin.yml pour rajouter la commande (suivez l'exemple de la première commande)<br>
Quand un joueur tape la commande, stockez le dans une hashmap.<br>
Créez ensuite une nouvelle fonction @EventHandler dans votre listener, il devras prendre en paramètre EntityDamageEvent<br>
Dans cette fonction vérifiez bien que ce joueur appartiens a la hashmap puis annulez l'évent si c'est le cas.<br><Br>

</details>

## Excalibur le retour <br><br>

Encore une commande !<br>
Quand le joueur exécutera la commande `/excalibur` il recevra une arme surpuissante !<br>
Créez a nouveau une commande et utilisez les `ItemStack` et `ItemMeta`<br>
Pour pouvoir créer une super arme qui sera enchantée avec `sharpness 420`<br>

## My menu

Il est temps de créer son premier menu intéractif !<br>
Créez une nouvelle classe qui nous servira de base de menu.<br>
Quand un joueur tapera la commande `/menu` il vera un inventaire s'ouvrir<br>
Ce dernier lui servira menu de navigation, pour par exemple, activer son mode invincible<br><br>

Utilisez la fonction `Bukkit.createInventory()` avec comme paramètres<br>
`27`, `null` et `unNom` pour créer un inventaire qui n'appartien a personne avec 3 lignes.<br>
Le nom lui, nous permettra de différencier cet inventaire des autres quand l'évent sera appeler.<br><br>

[indice (Car l'exo est un peu plus compliquer)](./.indice_menu.md)<br><br>

## La fin... mais<br><br>

Le Workshop se termine ici, nous considérons que vous avez assez appris<br>
pour flex devant vos amis jouant a minecraft 😎<br>
Néanmoins, vous pouvez poursuivre le workshop pour apprendre des choses plus avancées.<br>
Dans le cas contraire, expérimentez ! Vous êtes libres de pouvoir faire ce que vous voulez<br>
Créez de nouveau plugins, amusez vous et surtout comme dit le grand [Léo Techmaker](https://www.youtube.com/channel/UCRhyS_ylPQ5GWBl1lK92ftA)...<br><br>

[N'ARRETEZ JAMAIS D'APPRENDRE](https://www.youtube.com/watch?v=1iCwWF-D2as)<br><br>