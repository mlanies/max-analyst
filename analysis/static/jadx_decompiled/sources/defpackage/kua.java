package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kua {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public final dk a() {
        dk dkVar = new dk();
        dkVar.o = this.a;
        dkVar.X = this.b;
        dkVar.Y = this.c;
        dkVar.Z = this.d;
        dkVar.b = this.e;
        dkVar.c = this.f;
        return dkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof kua)) {
            return false;
        }
        kua kuaVar = (kua) obj;
        String str = this.d;
        String str2 = kuaVar.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.a), Objects.toString(kuaVar.a)) && Objects.equals(this.c, kuaVar.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(kuaVar.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(kuaVar.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
