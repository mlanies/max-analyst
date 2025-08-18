package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class mbc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mbc mbcVar = (mbc) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mbcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mbc mbcVar = new mbc(continuation, this.Y);
        mbcVar.X = obj;
        return mbcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = (String) this.X;
        RecordControlsWidget recordControlsWidget = this.Y;
        lsf lsfVar = recordControlsWidget.E0;
        if (lsfVar != null) {
            lsfVar.setDurationText(str);
        }
        recordControlsWidget.x0().setText(str);
        return e5f.a;
    }
}
