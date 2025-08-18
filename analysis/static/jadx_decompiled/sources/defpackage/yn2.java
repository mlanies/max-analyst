package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public final class yn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yn2 yn2Var = (yn2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yn2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yn2 yn2Var = new yn2(continuation, this.Y);
        yn2Var.X = obj;
        return yn2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        View videoMessageRecordAnchor;
        Activity activityD;
        int i = 2;
        od2.a0(obj);
        iac iacVar = (iac) this.X;
        boolean z = iacVar instanceof dac;
        ChatScreen chatScreen = this.Y;
        if (z) {
            dac dacVar = (dac) iacVar;
            o2 o2Var = dacVar.a;
            if (o2Var instanceof fif) {
                bc7[] bc7VarArr = ChatScreen.k1;
                rq2 rq2VarP0 = chatScreen.P0();
                fif fifVar = (fif) o2Var;
                Long lW = chatScreen.F0().w();
                zy8 zy8VarV = chatScreen.F0().v();
                cz5 cz5VarA = zy8VarV != null ? zy8VarV.a() : null;
                e52 e52Var = (e52) rq2VarP0.Y0.a.getValue();
                if (e52Var != null) {
                    rq2VarP0.C(pnf.n(rq2VarP0, null, vx3.b, new dq2(rq2VarP0, e52Var.a, fifVar, lW, cz5VarA, null), 1));
                }
            } else if (o2Var instanceof j50) {
                bc7[] bc7VarArr2 = ChatScreen.k1;
                rq2 rq2VarP02 = chatScreen.P0();
                List listSingletonList = Collections.singletonList(dacVar.a);
                Long lW2 = chatScreen.F0().w();
                zy8 zy8VarV2 = chatScreen.F0().v();
                rq2VarP02.B(null, listSingletonList, false, lW2, zy8VarV2 != null ? zy8VarV2.a() : null);
                xx6 xx6Var = (xx6) chatScreen.h1.getValue();
                if (xx6Var != null) {
                    xx6Var.f(Collections.singleton(new wx6(ux6.o, 1)), wuc.CHAT);
                }
            }
        } else if (iacVar instanceof gac) {
            ChatScreen.U0(chatScreen, null, String.valueOf(((gac) iacVar).a.b(chatScreen.getContext())), null, null, 13);
        } else if (iacVar instanceof fac) {
            vo2 vo2Var = vo2.c;
            if (!vo2Var.P1().d() && (activityD = ((haa) vo2Var.P1().a()).f().C().d()) != null) {
                activityD.finish();
            }
        } else if (iacVar instanceof hac) {
            bc7[] bc7VarArr3 = ChatScreen.k1;
            MessageWriteWidget messageWriteWidgetG0 = chatScreen.G0();
            if (messageWriteWidgetG0 != null) {
                hac hacVar = (hac) iacVar;
                int[] iArr = new int[2];
                int iOrdinal = hacVar.a.ordinal();
                if (iOrdinal == 0) {
                    videoMessageRecordAnchor = messageWriteWidgetG0.q0().getVideoMessageRecordAnchor();
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoMessageRecordAnchor = messageWriteWidgetG0.q0().getAudioRecordAnchor();
                }
                View view = videoMessageRecordAnchor;
                if (view != null) {
                    view.getLocationOnScreen(iArr);
                    int iQ = rh4.q(18, fk4.d().getDisplayMetrics().density, (br7.D(messageWriteWidgetG0.getContext()) - iArr[0]) - (view.getWidth() / 2));
                    WindowInsets rootWindowInsets = messageWriteWidgetG0.requireView().getRootWindowInsets();
                    int i2 = rootWindowInsets != null ? x6g.f(null, rootWindowInsets).a.f(7).d : 0;
                    int i3 = vc7.a;
                    Point point = new Point(iQ, (messageWriteWidgetG0.q0().getHeight() - tu0.G(8 * fk4.d().getDisplayMetrics().density)) + i2 + (vc7.b(vc7.c) ? vc7.a(messageWriteWidgetG0.getContext()) : 0));
                    ywe yweVar = messageWriteWidgetG0.D0;
                    if (yweVar == null || !yweVar.isShowing()) {
                        ywe yweVar2 = messageWriteWidgetG0.D0;
                        if (yweVar2 != null) {
                            yweVar2.dismiss();
                        }
                        ywe yweVar3 = new ywe(messageWriteWidgetG0.getContext(), view, new yz8(messageWriteWidgetG0, i), (k56) null, 2, 3, 8);
                        yweVar3.d(hacVar.b);
                        yweVar3.e(point, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                        yweVar3.setOnDismissListener(new c09(messageWriteWidgetG0, 0));
                        messageWriteWidgetG0.D0 = yweVar3;
                    } else {
                        ywe yweVar4 = messageWriteWidgetG0.D0;
                        if (yweVar4 != null) {
                            yweVar4.e(point, 8388693, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                        }
                    }
                }
            }
        } else {
            if (!(iacVar instanceof eac)) {
                throw new NoWhenBranchMatchedException();
            }
            eac eacVar = (eac) iacVar;
            int iOrdinal2 = eacVar.a.ordinal();
            boolean z2 = eacVar.b;
            if (iOrdinal2 == 0) {
                bc7[] bc7VarArr4 = ChatScreen.k1;
                rq2 rq2VarP03 = chatScreen.P0();
                e52 e52Var2 = (e52) rq2VarP03.Y0.a.getValue();
                if (e52Var2 != null) {
                    long j = e52Var2.b.a;
                    je7 je7Var = rq2VarP03.I0;
                    if (z2) {
                        sna snaVar = (sna) je7Var.getValue();
                        snaVar.getClass();
                        if (j != 0) {
                            snaVar.f(j, b10.VIDEO_MSG, -2L);
                        }
                    } else {
                        sna snaVar2 = (sna) je7Var.getValue();
                        if (j == 0) {
                            snaVar2.getClass();
                        } else {
                            snaVar2.getClass();
                            sna.b(j, -2L);
                        }
                    }
                }
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                bc7[] bc7VarArr5 = ChatScreen.k1;
                rq2 rq2VarP04 = chatScreen.P0();
                e52 e52Var3 = (e52) rq2VarP04.Y0.a.getValue();
                if (e52Var3 != null) {
                    long j2 = e52Var3.b.a;
                    je7 je7Var2 = rq2VarP04.I0;
                    if (z2) {
                        sna snaVar3 = (sna) je7Var2.getValue();
                        snaVar3.getClass();
                        if (j2 != 0) {
                            snaVar3.f(j2, b10.AUDIO, -1L);
                        }
                    } else {
                        sna snaVar4 = (sna) je7Var2.getValue();
                        if (j2 == 0) {
                            snaVar4.getClass();
                        } else {
                            snaVar4.getClass();
                            sna.b(j2, -1L);
                        }
                    }
                }
            }
        }
        return e5f.a;
    }
}
