package defpackage;

import android.view.View;
import java.util.Collections;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class oz5 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardPickerScreen b;

    public /* synthetic */ oz5(ForwardPickerScreen forwardPickerScreen, int i) {
        this.a = i;
        this.b = forwardPickerScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        ForwardPickerScreen forwardPickerScreen = this.b;
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bc7[] bc7VarArr = ForwardPickerScreen.I0;
                forwardPickerScreen.C0(zBooleanValue);
                break;
            case 1:
                bc7[] bc7VarArr2 = ForwardPickerScreen.I0;
                i3a onBackPressedDispatcher = forwardPickerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            default:
                bc7[] bc7VarArr3 = ForwardPickerScreen.I0;
                dy7.c(1).Y((View) obj).I(forwardPickerScreen.B0() ? Collections.singletonList(new tt3(m8a.e, new eqe(o8a.b), Integer.valueOf(woc.s1), (Integer) null, 20)) : Collections.singletonList(new tt3(m8a.f, new eqe(o8a.c), Integer.valueOf(woc.r1), (Integer) null, 20))).s().build().q(forwardPickerScreen);
                break;
        }
        return e5fVar;
    }
}
