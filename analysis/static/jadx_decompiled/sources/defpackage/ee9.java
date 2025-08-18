package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public class ee9 extends ok0 {
    public final List j;

    public ee9(String str, List list, long j, long j2, long j3, uy uyVar, boolean z, int i, int i2) {
        super(i, i2, j2, j, j3, uyVar, str, false, z);
        this.j = list;
    }

    @Override // defpackage.ok0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return this.j.equals(((ee9) obj).j);
        }
        return false;
    }

    @Override // defpackage.fef
    public final int getHeight() {
        List list = this.j;
        if (list.isEmpty()) {
            return 0;
        }
        return ((ce9) list.get(0)).c;
    }

    @Override // defpackage.fef
    public final int getWidth() {
        List list = this.j;
        if (list.isEmpty()) {
            return 0;
        }
        return ((ce9) list.get(0)).b;
    }

    @Override // defpackage.ok0
    public int hashCode() {
        return this.j.hashCode() + (super.hashCode() * 31);
    }

    @Override // defpackage.fef
    public final int j() {
        return 2;
    }

    @Override // defpackage.fef
    public final Uri l() {
        return Uri.parse(((ce9) this.j.get(0)).a);
    }

    public ee9(long j, long j2, List list, boolean z) {
        this(null, list, j, j2, 0L, null, z, -1, -1);
    }
}
