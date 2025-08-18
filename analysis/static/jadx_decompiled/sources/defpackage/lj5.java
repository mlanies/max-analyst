package defpackage;

import java.io.File;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class lj5 implements c6d {
    public final File a;
    public final int b = 2;

    public lj5(File file) {
        this.a = file;
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        return new jj5(this);
    }
}
