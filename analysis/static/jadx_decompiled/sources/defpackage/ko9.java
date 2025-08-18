package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ko9 extends ffe implements a66 {
    public final /* synthetic */ Intent X;
    public final /* synthetic */ mo9 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko9(Intent intent, mo9 mo9Var, Continuation continuation) {
        super(2, continuation);
        this.X = intent;
        this.Y = mo9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ko9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ko9(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Rect rect;
        od2.a0(obj);
        RectF rectF = (RectF) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_RECT");
        e5f e5fVar = e5f.a;
        if (rectF == null || (rect = (Rect) this.X.getParcelableExtra("ru.ok.tamtam.extra.CROPPED_ABSOLUTE")) == null) {
            return e5fVar;
        }
        String absolutePath = ((kk5) this.Y.b.getValue()).q(this.Y.k).getAbsolutePath();
        mo9 mo9Var = this.Y;
        mo9Var.getClass();
        j47.T(mo9Var.f, null, null, new jo9(absolutePath, rect, mo9Var, rectF, 1, null), 3);
        return e5fVar;
    }
}
