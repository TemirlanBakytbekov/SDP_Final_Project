package FactoryPattern;
import ObserverPattern.Character;
import ObserverPattern.Alchemist;

public class AlchemistFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Alchemist();
    }
}