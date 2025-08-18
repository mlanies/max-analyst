package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i06 implements ov6 {
    public final ov6 b;
    public final Object a = new Object();
    public final HashSet c = new HashSet();

    public i06(ov6 ov6Var) {
        this.b = ov6Var;
    }

    @Override // defpackage.ov6
    public final Image Z() {
        return this.b.Z();
    }

    public final void a(h06 h06Var) {
        synchronized (this.a) {
            this.c.add(h06Var);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((h06) it.next()).a(this);
        }
    }

    @Override // defpackage.ov6
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // defpackage.ov6
    public su6 getImageInfo() {
        return this.b.getImageInfo();
    }

    @Override // defpackage.ov6
    public int getWidth() {
        return this.b.getWidth();
    }

    @Override // defpackage.ov6
    public final int k0() {
        return this.b.k0();
    }

    @Override // defpackage.ov6
    public final sy4[] v() {
        return this.b.v();
    }
}
