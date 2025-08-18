package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class q37 extends ConcurrentHashMap {
    public static final q37 b = new q37();
    public final Object a;

    public q37() {
        super(180, 0.8f, 4);
        this.a = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.a) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } finally {
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
