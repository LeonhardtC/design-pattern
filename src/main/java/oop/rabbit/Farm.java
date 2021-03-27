package oop.rabbit;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Farm {
    private Set<Rabbit> rabbits = new CopyOnWriteArraySet<Rabbit>();

    public void addRabbit(Rabbit rabbit) {
        rabbits.add(rabbit);
    }

    public void removeRabbit(Rabbit rabbit) {
        rabbits.remove(rabbit);
    }

    public void init() {
        rabbits = new CopyOnWriteArraySet<Rabbit>();
        rabbits.add(new Rabbit(this));
    }

    public int count(int mouth) {
        for (int i = 0; i < mouth; i++) {
            Iterator<Rabbit> iterator = rabbits.iterator();
            while (iterator.hasNext()) {
                iterator.next().action();
            }
        }
        return rabbits.size();
    }
}
