package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final class kkd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ShareDataPickerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkd(ShareDataPickerScreen shareDataPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = shareDataPickerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kkd kkdVar = (kkd) n((dkd) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kkdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kkd kkdVar = new kkd(this.Y, continuation);
        kkdVar.X = obj;
        return kkdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (tpa.f((dkd) this.X, dkd.a)) {
            ShareDataPickerScreen shareDataPickerScreen = this.Y;
            String string = shareDataPickerScreen.getArgs().getString("tag");
            if (string != null) {
                Object objG = shareDataPickerScreen.getRouter().g(string);
                if ((objG instanceof mkd ? (mkd) objG : null) != null) {
                    ckb.c.f2();
                }
            }
            yjd yjdVar = yjd.c;
            if (!yjdVar.P1().d()) {
                yjdVar.P1().b(":chat-list", null);
            }
        }
        return e5f.a;
    }
}
