package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* loaded from: classes2.dex */
public final class ff3 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;
    public int Z;
    public ConfirmPhoneScreen o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(continuation);
        this.Y = confirmPhoneScreen;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return ConfirmPhoneScreen.m0(this.Y, null, this);
    }
}
