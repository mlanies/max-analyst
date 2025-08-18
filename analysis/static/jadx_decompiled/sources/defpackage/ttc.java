package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* loaded from: classes2.dex */
public final class ttc extends ffe implements a66 {
    public final /* synthetic */ ScheduledSendPickerViewModel X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttc(ScheduledSendPickerViewModel scheduledSendPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.X = scheduledSendPickerViewModel;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ttc ttcVar = (ttc) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ttcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ttc(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ScheduledSendPickerViewModel scheduledSendPickerViewModel = this.X;
        scheduledSendPickerViewModel.g(ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel));
        return e5f.a;
    }
}
