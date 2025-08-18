package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class h2a extends TextView {
    public aof a;

    public h2a(Context context) {
        super(context, null, 0);
    }

    public final aof getObserverSpanListener() {
        return this.a;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        aof aofVar;
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            if (i == 8 && (aofVar = this.a) != null) {
                aofVar.onViewDetachedFromWindow(this);
                return;
            }
            return;
        }
        aof aofVar2 = this.a;
        if (aofVar2 != null) {
            aofVar2.onViewAttachedToWindow(this);
        }
    }

    public final void setObserverSpanListener(aof aofVar) {
        this.a = aofVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
    }
}
