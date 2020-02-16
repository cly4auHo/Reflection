package paket;

import java.lang.ref.WeakReference;

public class ObjInCache {

    WeakReference<Obj> cache;

    public Obj getObj() {
        if (cache == null || cache.get() == null) {
            cache = new WeakReference<>(new Obj());
            System.out.println("New Obj");
        } else
            System.out.println("Old na meste");

        return cache.get();
    }
}
