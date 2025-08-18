package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ga0 implements f15 {
    public final int a;
    public final int b;
    public final List c;
    public final List d;

    public ga0(int i, int i2, List list, List list2) {
        this.a = i;
        this.b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.d = list2;
    }

    public static ga0 e(int i, int i2, List list, List list2) {
        return new ga0(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    @Override // defpackage.f15
    public final int a() {
        return this.a;
    }

    @Override // defpackage.f15
    public final int b() {
        return this.b;
    }

    @Override // defpackage.f15
    public final List c() {
        return this.c;
    }

    @Override // defpackage.f15
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ga0)) {
            return false;
        }
        ga0 ga0Var = (ga0) obj;
        return this.a == ga0Var.a && this.b == ga0Var.b && this.c.equals(ga0Var.c) && this.d.equals(ga0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.a);
        sb.append(", recommendedFileFormat=");
        sb.append(this.b);
        sb.append(", audioProfiles=");
        sb.append(this.c);
        sb.append(", videoProfiles=");
        return au1.i(sb, this.d, "}");
    }
}
