package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class r6g extends q6g {
    public r6g(x6g x6gVar, WindowInsets windowInsets) {
        super(x6gVar, windowInsets);
    }

    @Override // defpackage.v6g
    public x6g a() {
        return x6g.f(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.v6g
    public tl4 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new tl4(displayCutout);
    }

    @Override // defpackage.v6g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6g)) {
            return false;
        }
        r6g r6gVar = (r6g) obj;
        return Objects.equals(this.c, r6gVar.c) && Objects.equals(this.g, r6gVar.g);
    }

    @Override // defpackage.v6g
    public int hashCode() {
        return this.c.hashCode();
    }
}
