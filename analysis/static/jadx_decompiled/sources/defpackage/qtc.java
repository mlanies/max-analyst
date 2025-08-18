package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* loaded from: classes2.dex */
public final class qtc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ScheduledSendPickerDialogFragment Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.Y = scheduledSendPickerDialogFragment;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qtc qtcVar = (qtc) n((m34) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qtcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qtc qtcVar = new qtc(this.Y, continuation);
        qtcVar.X = obj;
        return qtcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        m34 m34Var = (m34) this.X;
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.Y;
        LongRoundedTitleSubtitleButton longRoundedTitleSubtitleButtonC = scheduledSendPickerDialogFragment.m1().c();
        Context contextU0 = scheduledSendPickerDialogFragment.U0();
        m34Var.getClass();
        longRoundedTitleSubtitleButtonC.setSubtitle(contextU0.getString(dpc.r, m34Var.a.X, m34Var.b + ":" + m34Var.c));
        return e5f.a;
    }
}
