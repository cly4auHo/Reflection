package paket;

public class CacheLoader {

    public static void main(String[] args) {
        ObjInCache objInCache = new ObjInCache();

        System.out.println(objInCache.getObj());
        System.out.println(objInCache.getObj());
        System.gc();
        System.out.println(objInCache.getObj());
        System.out.println(objInCache.getObj());
    }
}
