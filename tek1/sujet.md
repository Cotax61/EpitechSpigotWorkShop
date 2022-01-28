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

## La configuration <br><br>

Configurez correctement votre [pom.xlm](./pom.xml) et votre [plugin.yml](./plugin.yml), il sont déjà pré-compléter, vous avez juste a modifier les valeurs pour customiser un peu.<br><br>

## Le premier test ! <br><br>

Une fois tout ça configurer, voyons voir si cela fonctionne, exécturez maven pour compiler,<br>
ensuite allez dans le dossier `mavenbuild` qui a été créer. Dans ce dernier vous trouverez<br>
votre `.jar`, déplacez le dossier `server/plugins` (si il n'y est pas, lancez le serveur avec un des scripts `start`).<br><br>

Une fois cela fait, lancez votre jeu en 1.18.1, puis dans le panneau **multijoueur** cliquez sur **connection rapide**<br>
et entrez `localhost`, vous devrez reussir a entrer en jeu, mettez vous opérateur grace a la commande<br>
`op \<Player\>` sur votre terminal qui est en charge du serveur, puis en jeu lancez la commande `/pl` dnas le chat<br>
Si vous avez 0 plugin, utilisez `/reload`, puis refaites la commande `/pl` si c'est toujours 0, il y a **une erreur dans votre console** ! <br>
Une fois que vous voyez votre plugin en jeu, continuez.<br><br>

## Hello... player ? <br><br>

Maintenant la partie sérieuse !<br>
Spigot est une librairie qui permet d'injecter du code grace a ce qu'on appelle des `eventListeners` ou plus court `Listener`<br>
Pour commencer dans le dossier `src` éditez le fichier **myListener.java**, pour vous, elle est déjà déclarée et hérite déjà du bon élément<br>
Créez un event dans cette classe, cet event sera *hook* sur l'event de connection et evera `Hello (nom du joueur)` a ce dernier<br>