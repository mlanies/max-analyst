package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;

/* loaded from: classes2.dex */
public final class pe8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        pe8 pe8Var = (pe8) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        pe8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pe8 pe8Var = new pe8(continuation, this.Y);
        pe8Var.X = obj;
        return pe8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        float fIntValue;
        od2.a0(obj);
        i3d i3dVar = (i3d) this.X;
        boolean z = i3dVar instanceof h3d;
        MediaPickerScreen mediaPickerScreen = this.Y;
        if (z) {
            bc7[] bc7VarArr = MediaPickerScreen.B0;
            mediaPickerScreen.o0().setDropdownRotationProgress(0.0f);
            bc7[] bc7VarArr2 = MediaPickerScreen.B0;
            bc7 bc7Var = bc7VarArr2[4];
            mediaPickerScreen.v0.b(mediaPickerScreen, 0);
            bc7 bc7Var2 = bc7VarArr2[3];
            ((w12) mediaPickerScreen.u0.getValue()).setVisibility(8);
            bc7 bc7Var3 = bc7VarArr2[7];
            ((View) mediaPickerScreen.y0.getValue()).setVisibility(8);
        } else if (i3dVar instanceof f3d) {
            bc7[] bc7VarArr3 = MediaPickerScreen.B0;
            mediaPickerScreen.getClass();
            bc7[] bc7VarArr4 = MediaPickerScreen.B0;
            bc7 bc7Var4 = bc7VarArr4[4];
            if (((Number) mediaPickerScreen.v0.a(mediaPickerScreen)).intValue() > 0) {
                float f = ((f3d) i3dVar).a;
                bc7 bc7Var5 = bc7VarArr4[4];
                fIntValue = f / ((Number) r2.a(mediaPickerScreen)).intValue();
            } else {
                fIntValue = 180.0f;
            }
            mediaPickerScreen.o0().setDropdownRotationProgress(fIntValue);
        }
        return e5f.a;
    }
}
