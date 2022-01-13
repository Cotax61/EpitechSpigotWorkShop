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

