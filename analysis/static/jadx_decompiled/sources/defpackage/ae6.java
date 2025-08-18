package defpackage;

import android.graphics.Picture;
import android.text.Layout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ae6 extends ffe implements a66 {
    public final /* synthetic */ Layout X;
    public final /* synthetic */ be6 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae6(Layout layout, be6 be6Var, Continuation continuation) {
        super(2, continuation);
        this.X = layout;
        this.Y = be6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ae6 ae6Var = (ae6) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ae6Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ae6(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Layout layout = this.X;
        od2.a0(obj);
        v5b v5bVar = be6.c;
        Picture picture = (Picture) v5bVar.f();
        if (picture == null) {
            picture = new Picture();
        }
        try {
            try {
                layout.draw(picture.beginRecording(layout.getWidth(), layout.getHeight()));
                picture.endRecording();
                v5bVar.e(picture);
            } catch (Throwable th) {
                picture.endRecording();
                throw th;
            }
        } catch (Throwable th2) {
            hm9.p(this.Y.b, "fail to warm layout", th2);
        }
        return e5f.a;
    }
}
