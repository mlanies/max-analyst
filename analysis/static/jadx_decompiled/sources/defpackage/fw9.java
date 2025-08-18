package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.messages.NotificationsImagesProvider;

/* loaded from: classes2.dex */
public final class fw9 extends hu3 {
    public ww0 X;
    public sx3 Y;
    public /* synthetic */ Object Z;
    public NotificationsImagesProvider o;
    public final /* synthetic */ NotificationsImagesProvider s0;
    public int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw9(NotificationsImagesProvider notificationsImagesProvider, Continuation continuation) {
        super(continuation);
        this.s0 = notificationsImagesProvider;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.Z = obj;
        this.t0 |= Integer.MIN_VALUE;
        return NotificationsImagesProvider.a(this.s0, null, null, this);
    }
}
