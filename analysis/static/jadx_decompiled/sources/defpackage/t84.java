package defpackage;

import android.graphics.drawable.Drawable;
import java.io.Closeable;
import java.io.IOException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class t84 extends u84 implements p43, kre {
    public final j0e X;
    public boolean Y;
    public final ContextScope Z;
    public Drawable o;

    public t84(Drawable drawable, w7c w7cVar, cx7 cx7Var) {
        this.o = drawable;
        this.X = w7cVar;
        ContextScope contextScopeA = j1e.a(cx7Var);
        this.Z = contextScopeA;
        od2.L(new zn5(w7cVar, new lq0(2, this, t84.class, "onThemeChanged", "onThemeChanged(Lone/me/sdk/design/OneMeTheme;)V", 4, 16), 5), contextScopeA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p43
    public final Drawable J() {
        Drawable drawable = this.o;
        if (drawable == null) {
            return null;
        }
        Drawable drawableMutate = drawable.mutate();
        if (drawableMutate != drawable) {
            drawableMutate.setBounds(drawable.getBounds());
        }
        if (drawableMutate instanceof kre) {
            ((kre) drawableMutate).onThemeChanged((fka) this.X.getValue());
        }
        return drawableMutate;
    }

    @Override // defpackage.l43, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        j1e.i(this.Z, null);
        Object obj = this.o;
        Closeable closeable = obj instanceof Closeable ? (Closeable) obj : null;
        if (closeable != null) {
            closeable.close();
        }
        this.o = null;
        this.Y = true;
    }

    @Override // defpackage.l43, defpackage.ru6
    public final int getHeight() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Integer numValueOf = Integer.valueOf(drawable.getIntrinsicHeight());
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    @Override // defpackage.l43
    public final int getSizeInBytes() {
        return getHeight() * getWidth() * 4;
    }

    @Override // defpackage.l43, defpackage.ru6
    public final int getWidth() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    @Override // defpackage.l43
    public final boolean isClosed() {
        return this.Y;
    }

    @Override // defpackage.ei0, defpackage.l43
    public final boolean isStateful() {
        Drawable drawable = this.o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Object obj = this.o;
        kre kreVar = obj instanceof kre ? (kre) obj : null;
        if (kreVar != null) {
            kreVar.onThemeChanged(fkaVar);
        }
    }
}
