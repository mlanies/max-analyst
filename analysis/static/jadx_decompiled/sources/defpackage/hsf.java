package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class hsf extends ffe implements c66 {
    public final /* synthetic */ int X = 0;
    public /* synthetic */ lsf Y;

    public /* synthetic */ hsf(int i, Continuation continuation) {
        super(i, continuation);
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                hsf hsfVar = new hsf(3, (Continuation) obj3);
                hsfVar.Y = (lsf) obj;
                e5f e5fVar = e5f.a;
                hsfVar.o(e5fVar);
                return e5fVar;
            default:
                hsf hsfVar2 = new hsf(this.Y, (Continuation) obj3);
                e5f e5fVar2 = e5f.a;
                hsfVar2.o(e5fVar2);
                return e5fVar2;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e5f e5fVar = e5f.a;
        uac uacVar = null;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                lsf lsfVar = this.Y;
                isf isfVar = lsfVar.o;
                if (isfVar != null) {
                    bc7[] bc7VarArr = RecordControlsWidget.b1;
                    uacVar = (uac) ((RecordControlsWidget) ((y8) isfVar).a).I0().w0.a.getValue();
                }
                lsfVar.setBackgroundColor(uacVar instanceof rac);
                break;
            default:
                od2.a0(obj);
                lsf lsfVar2 = this.Y;
                isf isfVar2 = lsfVar2.o;
                if (isfVar2 != null) {
                    bc7[] bc7VarArr2 = RecordControlsWidget.b1;
                    uacVar = (uac) ((RecordControlsWidget) ((y8) isfVar2).a).I0().w0.a.getValue();
                }
                lsfVar2.setDurationColor(uacVar instanceof rac);
                break;
        }
        return e5fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsf(lsf lsfVar, Continuation continuation) {
        super(3, continuation);
        this.Y = lsfVar;
    }
}
