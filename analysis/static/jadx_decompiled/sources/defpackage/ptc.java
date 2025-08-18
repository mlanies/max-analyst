package defpackage;

import android.os.Parcelable;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* loaded from: classes2.dex */
public final class ptc extends ffe implements a66 {
    public final /* synthetic */ ScheduledSendPickerDialogFragment X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.X = scheduledSendPickerDialogFragment;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ptc) n((tm9) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ptc(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.X;
        m34 m34Var = (m34) scheduledSendPickerDialogFragment.n1().f.a.getValue();
        e5f e5fVar = e5f.a;
        if (m34Var == null) {
            return e5fVar;
        }
        utc utcVar = scheduledSendPickerDialogFragment.n1().o;
        bc7 bc7Var = ScheduledSendPickerViewModel.p[0];
        scheduledSendPickerDialogFragment.o1(new jtc(m34Var, ((Boolean) utcVar.b).booleanValue(), (Parcelable) scheduledSendPickerDialogFragment.F1.getValue()));
        scheduledSendPickerDialogFragment.e1();
        return e5fVar;
    }
}
