package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* loaded from: classes2.dex */
public final class k7c extends hu3 {
    public Object X;
    public ix8 Y;
    public v5c Z;
    public ReactionsViewModel o;
    public c6c s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ ReactionsViewModel u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7c(ReactionsViewModel reactionsViewModel, Continuation continuation) {
        super(continuation);
        this.u0 = reactionsViewModel;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return ReactionsViewModel.e(this.u0, null, this);
    }
}
