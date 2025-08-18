package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class dd8 {
    public Integer A;
    public Integer B;
    public CharSequence C;
    public CharSequence D;
    public CharSequence E;
    public Bundle F;
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public Uri h;
    public d5c i;
    public d5c j;
    public byte[] k;
    public Integer l;
    public Uri m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Boolean q;
    public Integer r;
    public Integer s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public CharSequence x;
    public CharSequence y;
    public CharSequence z;

    public final void a(int i, byte[] bArr) {
        if (this.k != null) {
            Integer numValueOf = Integer.valueOf(i);
            int i2 = maf.a;
            if (!numValueOf.equals(3) && maf.a(this.l, 3)) {
                return;
            }
        }
        this.k = (byte[]) bArr.clone();
        this.l = Integer.valueOf(i);
    }
}
