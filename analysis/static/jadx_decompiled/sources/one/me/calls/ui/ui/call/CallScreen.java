package one.me.calls.ui.ui.call;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a11;
import defpackage.av3;
import defpackage.b;
import defpackage.bc7;
import defpackage.bt1;
import defpackage.bvc;
import defpackage.c3;
import defpackage.c41;
import defpackage.ci1;
import defpackage.coc;
import defpackage.d41;
import defpackage.d95;
import defpackage.dec;
import defpackage.di1;
import defpackage.dm1;
import defpackage.dr1;
import defpackage.dy7;
import defpackage.e41;
import defpackage.el1;
import defpackage.en1;
import defpackage.eo1;
import defpackage.eua;
import defpackage.f41;
import defpackage.f9;
import defpackage.fg7;
import defpackage.fm1;
import defpackage.foc;
import defpackage.g41;
import defpackage.gaa;
import defpackage.gi1;
import defpackage.gl1;
import defpackage.glc;
import defpackage.gm1;
import defpackage.gyd;
import defpackage.hl1;
import defpackage.hm9;
import defpackage.hob;
import defpackage.hyd;
import defpackage.i1b;
import defpackage.i3a;
import defpackage.im;
import defpackage.iq9;
import defpackage.ir1;
import defpackage.iyd;
import defpackage.j03;
import defpackage.j31;
import defpackage.je7;
import defpackage.ji1;
import defpackage.jpb;
import defpackage.k11;
import defpackage.k56;
import defpackage.khe;
import defpackage.la1;
import defpackage.li1;
import defpackage.lyd;
import defpackage.m38;
import defpackage.mi1;
import defpackage.mm1;
import defpackage.nec;
import defpackage.ni1;
import defpackage.nnf;
import defpackage.od1;
import defpackage.od2;
import defpackage.oec;
import defpackage.oi1;
import defpackage.pi1;
import defpackage.pn1;
import defpackage.q0e;
import defpackage.q21;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.qw;
import defpackage.ru3;
import defpackage.rvb;
import defpackage.s;
import defpackage.si9;
import defpackage.tnd;
import defpackage.tpa;
import defpackage.tta;
import defpackage.tu0;
import defpackage.u1;
import defpackage.u21;
import defpackage.u8b;
import defpackage.ugf;
import defpackage.uu3;
import defpackage.uv3;
import defpackage.vi1;
import defpackage.w4d;
import defpackage.w7c;
import defpackage.wd1;
import defpackage.wmc;
import defpackage.wr1;
import defpackage.x77;
import defpackage.xi1;
import defpackage.xm1;
import defpackage.xt3;
import defpackage.y7a;
import defpackage.yi1;
import defpackage.yxc;
import defpackage.zm1;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zr6;
import defpackage.zu3;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lone/me/calls/ui/ui/call/CallScreen;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Liq9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "yxc", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallScreen extends Widget implements xt3, iq9 {
    public static final yxc R0;
    public static final /* synthetic */ bc7[] S0;
    public final je7 A0;
    public final qm0 B0;
    public final qm0 C0;
    public final je7 D0;
    public final je7 E0;
    public final je7 F0;
    public final je7 G0;
    public final je7 H0;
    public final qm0 I0;
    public final qm0 J0;
    public final qm0 K0;
    public final qm0 L0;
    public final qm0 M0;
    public final je7 N0;
    public od1 O0;
    public final je7 P0;
    public final glc Q0;
    public final khe X;
    public final khe Y;
    public final je7 Z;
    public final je7 a;
    public final khe b;
    public final khe c;
    public final khe o;
    public final String s0;
    public boolean t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public final q7c y0;
    public final i1b z0;

    static {
        hob hobVar = new hob(CallScreen.class, "callTopPanelRouter", "getCallTopPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0);
        oec oecVar = nec.a;
        S0 = new bc7[]{hobVar, zr6.e(oecVar, CallScreen.class, "callBottomPanelRouter", "getCallBottomPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), zr6.f(CallScreen.class, "callEventsRouter", "getCallEventsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oecVar), zr6.f(CallScreen.class, "callVpnRouter", "getCallVpnRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oecVar), zr6.f(CallScreen.class, "callWaitingRoomEventsRouter", "getCallWaitingRoomEventsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oecVar), zr6.f(CallScreen.class, "stubCallBottomUnavailablePanel", "getStubCallBottomUnavailablePanel()Landroid/view/ViewStub;", 0, oecVar), zr6.f(CallScreen.class, "callBottomUnavailablePanel", "getCallBottomUnavailablePanel()Lone/me/calls/ui/view/controls/CallBottomUnavailableView;", 0, oecVar), zr6.f(CallScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oecVar), zr6.f(CallScreen.class, "stubCallSpeakerLabel", "getStubCallSpeakerLabel()Landroid/view/ViewStub;", 0, oecVar), zr6.f(CallScreen.class, "callSpeakerLabel", "getCallSpeakerLabel()Lone/me/calls/ui/view/CallSpeakerLabel;", 0, oecVar), zr6.f(CallScreen.class, "stubCallChangeModeHint", "getStubCallChangeModeHint()Landroid/view/ViewStub;", 0, oecVar), zr6.f(CallScreen.class, "callChangeModeHint", "getCallChangeModeHint()Lone/me/calls/ui/view/CallChangeModeHintView;", 0, oecVar)};
        R0 = new yxc(8);
    }

    public CallScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = yi1.c();
        this.b = new khe(new k11(25));
        this.c = new khe(new ci1(this, 1));
        this.o = new khe(new ci1(this, 2));
        this.X = new khe(new k11(28));
        this.Y = new khe(new k11(29));
        this.Z = createViewModelLazy(el1.class, new s(20, new ci1(this, 3)));
        this.s0 = "CALL_SCREEN_SCOPE_ID";
        this.u0 = childSlotRouter(y7a.D1);
        this.v0 = childSlotRouter(y7a.o);
        this.w0 = childSlotRouter(rvb.call_events_view);
        this.x0 = childSlotRouter(rvb.call_screen_vpn_container_id);
        this.y0 = childSlotRouter(rvb.call_waiting_room_events_router);
        this.z0 = new i1b();
        this.A0 = tu0.r(3, new ci1(this, 4));
        this.B0 = binding(new ci1(this, 5));
        this.C0 = binding(new ci1(this, 7));
        this.D0 = tu0.r(3, new ci1(this, 8));
        this.E0 = tu0.r(3, new ci1(this, 6));
        this.F0 = tu0.r(3, new ci1(this, 12));
        this.G0 = tu0.r(3, new ci1(this, 13));
        this.H0 = tu0.r(3, new ci1(this, 14));
        this.I0 = binding(new ci1(this, 15));
        this.J0 = binding(new ci1(this, 16));
        this.K0 = binding(new ci1(this, 17));
        this.L0 = binding(new ci1(this, 18));
        this.M0 = binding(new ci1(this, 19));
        this.N0 = tu0.r(3, new ci1(this, 0));
        this.P0 = tu0.r(3, new k11(26));
        this.Q0 = new glc(new k11(27), null, 6);
    }

    public static final boolean m0(CallScreen callScreen, int i, String str) {
        od1 od1Var = callScreen.O0;
        if (od1Var != null && od1Var.g && callScreen.E0().getCurrentItem() != i && callScreen.E0().getChildCount() != 0) {
            callScreen.E0().setUserInputEnabled(false);
            callScreen.E0().e(i, false);
            hm9.n("CallModeScrollTag", "changeViewPagerPosition from=" + str + " newPos=" + i);
            return true;
        }
        hm9.n("CallModeScrollTag", "skip changeViewPagerPosition from=" + str + " currentPos=" + callScreen.E0().getCurrentItem() + " newPos=" + i + " isUserInputEnabled=" + callScreen.E0().F0);
        return false;
    }

    public static final j03 n0(CallScreen callScreen) {
        callScreen.getClass();
        return (j03) callScreen.x0.T0(callScreen, S0[3]);
    }

    public static final mm1 o0(CallScreen callScreen) {
        View childAt = callScreen.E0().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return null;
        }
        dec decVarM = recyclerView.M(callScreen.E0().getCurrentItem());
        View view = decVarM != null ? decVarM.a : null;
        if (view instanceof mm1) {
            return (mm1) view;
        }
        return null;
    }

    public static void q0(CallScreen callScreen) {
        callScreen.p0(!callScreen.z0().g);
    }

    public final ViewStub A0() {
        bc7 bc7Var = S0[5];
        return (ViewStub) this.B0.getValue();
    }

    public final ViewStub B0() {
        bc7 bc7Var = S0[10];
        return (ViewStub) this.L0.getValue();
    }

    public final ViewStub C0() {
        bc7 bc7Var = S0[8];
        return (ViewStub) this.J0.getValue();
    }

    public final el1 D0() {
        return (el1) this.Z.getValue();
    }

    public final ViewPager2 E0() {
        bc7 bc7Var = S0[7];
        return (ViewPager2) this.I0.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getB() {
        return this.s0;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.Q0;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        D0().c.j.b();
    }

    @Override // defpackage.uu3
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            D0().w(true, intent);
            hl1 hl1Var = (hl1) this.b.getValue();
            im imVarRequireActivity = requireActivity();
            hl1Var.getClass();
            Intent intent2 = new Intent(imVarRequireActivity, (Class<?>) CallServiceImpl.class);
            gl1 gl1Var = gl1.a;
            hl1.b(imVarRequireActivity, intent2.putExtra("ACTION", 5));
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        D0().c.j.a();
    }

    @Override // defpackage.uu3
    public final void onChangeEnded(zu3 zu3Var, av3 av3Var) {
        super.onChangeEnded(zu3Var, av3Var);
        boolean z = false;
        this.t0 = false;
        if (av3Var.b) {
            el1 el1VarD0 = D0();
            uv3 uv3VarZ0 = z0();
            if (uv3VarZ0.g && uv3VarZ0.b == null) {
                z = true;
            }
            el1VarD0.t(z);
        }
        if (av3Var == av3.POP_EXIT) {
            ((tnd) this.P0.getValue()).getClass();
            tnd.a();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onChangeStarted(zu3 zu3Var, av3 av3Var) {
        super.onChangeStarted(zu3Var, av3Var);
        this.t0 = true;
        D0().t(false);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object next;
        Object value;
        Object value2;
        Object value3;
        boolean z;
        Object value4;
        g41 d41Var;
        boolean z2 = D0().s().e instanceof d95;
        g41 e41Var = c41.a;
        if (z2) {
            String string = getArgs().getString("type");
            Iterator it = gi1.b.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    next = null;
                    break;
                }
                next = u1Var.next();
                if (tpa.f(((gi1) next).name(), string)) {
                    break;
                }
            }
            gi1 gi1Var = (gi1) next;
            if (gi1Var == null) {
                throw new IllegalStateException(("Unknown open type=" + string).toString());
            }
            int iOrdinal = gi1Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    d41Var = new d41(getArgs().getLong("chat_id", -1L), getArgs().getBoolean("video_enabled"), getArgs().getBoolean("microphone_enabled"));
                } else if (iOrdinal == 2) {
                    d41Var = new f41(getArgs().getLong("opponent_id", -1L), getArgs().getBoolean("video_enabled"), getArgs().getBoolean("microphone_enabled"));
                } else if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                e41Var = d41Var;
            } else {
                String string2 = getArgs().getString("link");
                if (string2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                e41Var = new e41(string2, getArgs().getBoolean("is_new"), getArgs().getBoolean("front_camera_enabled"), getArgs().getBoolean("video_enabled"), getArgs().getBoolean("microphone_enabled"));
            }
            getArgs().putString("type", "ACTIVE");
            final el1 el1VarD0 = D0();
            el1VarD0.getClass();
            boolean zB = e41Var.b();
            tta ttaVar = el1VarD0.b;
            boolean zB2 = ttaVar.a().b(eua.h);
            final m38 m38Var = m38.a;
            m38 m38Var2 = m38.X;
            m38 m38Var3 = m38.b;
            final m38 m38Var4 = !zB2 ? m38Var2 : zB ? m38Var3 : m38Var;
            boolean zA = e41Var.a();
            if (!ttaVar.a().b(eua.l)) {
                m38Var = m38Var2;
            } else if (zA) {
                m38Var = m38Var3;
            }
            boolean z3 = e41Var instanceof f41;
            q0e q0eVar = el1VarD0.x0;
            ir1 ir1Var = el1VarD0.c;
            if (z3) {
                zm1 zm1Var = new zm1(((f41) e41Var).a, m38Var == m38Var3);
                ir1Var.a(nnf.a);
                do {
                    value4 = q0eVar.getValue();
                } while (!q0eVar.c(value4, la1.a((la1) value4, null, null, null, false, m38Var, m38Var4, m38Var == m38Var3, 327615)));
                boolean z4 = m38Var == m38Var3;
                z = m38Var4 == m38Var3;
                final int i = 0;
                ((wr1) ir1Var.a).A(new lyd(new iyd(zm1Var), z4, z, new k56() { // from class: ek1
                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                m38 m38Var5 = m38.b;
                                boolean z5 = m38Var4 == m38Var5;
                                boolean z6 = m38Var == m38Var5;
                                ir1 ir1Var2 = el1VarD0.c;
                                MicrophoneManager microphoneManagerC = ((a11) ir1Var2.b).c();
                                if (microphoneManagerC != null) {
                                    microphoneManagerC.setMicEnabled(z5);
                                }
                                if (z5) {
                                    ((si9) ir1Var2.r.getValue()).g(Boolean.FALSE);
                                }
                                ir1Var2.g(z6);
                                break;
                            default:
                                m38 m38Var6 = m38.b;
                                boolean z7 = m38Var4 == m38Var6;
                                boolean z8 = m38Var == m38Var6;
                                ir1 ir1Var3 = el1VarD0.c;
                                MicrophoneManager microphoneManagerC2 = ((a11) ir1Var3.b).c();
                                if (microphoneManagerC2 != null) {
                                    microphoneManagerC2.setMicEnabled(z7);
                                }
                                if (z7) {
                                    ((si9) ir1Var3.r.getValue()).g(Boolean.FALSE);
                                }
                                ir1Var3.g(z8);
                                break;
                        }
                        return e5f.a;
                    }
                }));
            } else {
                boolean z5 = e41Var instanceof d41;
                nnf nnfVar = nnf.c;
                if (z5) {
                    xm1 xm1Var = new xm1(((d41) e41Var).a, m38Var == m38Var3);
                    ir1Var.a(nnfVar);
                    do {
                        value3 = q0eVar.getValue();
                    } while (!q0eVar.c(value3, la1.a((la1) value3, null, null, null, true, m38Var, m38Var4, false, 851903)));
                    boolean z6 = m38Var == m38Var3;
                    z = m38Var4 == m38Var3;
                    final int i2 = 1;
                    ((wr1) ir1Var.a).A(new lyd(new gyd(xm1Var), z6, z, new k56() { // from class: ek1
                        @Override // defpackage.k56
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    m38 m38Var5 = m38.b;
                                    boolean z52 = m38Var4 == m38Var5;
                                    boolean z62 = m38Var == m38Var5;
                                    ir1 ir1Var2 = el1VarD0.c;
                                    MicrophoneManager microphoneManagerC = ((a11) ir1Var2.b).c();
                                    if (microphoneManagerC != null) {
                                        microphoneManagerC.setMicEnabled(z52);
                                    }
                                    if (z52) {
                                        ((si9) ir1Var2.r.getValue()).g(Boolean.FALSE);
                                    }
                                    ir1Var2.g(z62);
                                    break;
                                default:
                                    m38 m38Var6 = m38.b;
                                    boolean z7 = m38Var4 == m38Var6;
                                    boolean z8 = m38Var == m38Var6;
                                    ir1 ir1Var3 = el1VarD0.c;
                                    MicrophoneManager microphoneManagerC2 = ((a11) ir1Var3.b).c();
                                    if (microphoneManagerC2 != null) {
                                        microphoneManagerC2.setMicEnabled(z7);
                                    }
                                    if (z7) {
                                        ((si9) ir1Var3.r.getValue()).g(Boolean.FALSE);
                                    }
                                    ir1Var3.g(z8);
                                    break;
                            }
                            return e5f.a;
                        }
                    }));
                } else if (e41Var instanceof e41) {
                    e41 e41Var2 = (e41) e41Var;
                    ir1Var.a(nnfVar);
                    do {
                        value2 = q0eVar.getValue();
                    } while (!q0eVar.c(value2, la1.a((la1) value2, null, null, null, true, m38Var, m38Var4, false, 851903)));
                    boolean z7 = m38Var == m38Var3;
                    boolean z8 = m38Var4 == m38Var3;
                    final boolean z9 = e41Var2.c;
                    k56 k56Var = new k56() { // from class: fk1
                        @Override // defpackage.k56
                        public final Object invoke() {
                            m38 m38Var5 = m38.b;
                            boolean z10 = m38Var4 == m38Var5;
                            boolean z11 = m38Var == m38Var5;
                            el1 el1Var = el1VarD0;
                            ir1 ir1Var2 = el1Var.c;
                            MicrophoneManager microphoneManagerC = ((a11) ir1Var2.b).c();
                            if (microphoneManagerC != null) {
                                microphoneManagerC.setMicEnabled(z10);
                            }
                            if (z10) {
                                ((si9) ir1Var2.r.getValue()).g(Boolean.FALSE);
                            }
                            ir1Var2.g(z11);
                            ir1 ir1Var3 = el1Var.c;
                            ir1Var3.getClass();
                            int i3 = z9 ? 1 : 2;
                            CameraManager cameraManagerA = ir1Var3.e.a();
                            if (cameraManagerA != null) {
                                cameraManagerA.switchCamera(new jx1(i3));
                            }
                            return e5f.a;
                        }
                    };
                    boolean z10 = !e41Var2.b;
                    String str = e41Var2.a;
                    if (str.length() == 0) {
                        throw new IllegalArgumentException("unknown target to call");
                    }
                    ((wr1) ir1Var.a).A(new lyd(new hyd(str, z10), z7, z8, k56Var));
                } else {
                    if (!(e41Var instanceof c41)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (ir1Var.c().a == null) {
                        u8b u8bVar = ir1Var.c().i;
                        if (u8bVar == null) {
                            u8bVar = u8b.e;
                        }
                        do {
                            value = q0eVar.getValue();
                        } while (!q0eVar.c(value, la1.a((la1) value, u8bVar.b, u8bVar.c, el1VarD0.s0.a(u8bVar.d), false, null, null, false, 1048523)));
                    }
                }
            }
        }
        return new li1(this, getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        dy7.D(requireActivity(), false);
        super.onDestroyView(view);
        if (!requireActivity().isChangingConfigurations()) {
            uv3 uv3VarZ0 = z0();
            uv3VarZ0.a.clear();
            View view2 = uv3VarZ0.c;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener((View.OnLayoutChangeListener) uv3VarZ0.e.getValue());
            }
            View view3 = uv3VarZ0.d;
            if (view3 != null) {
                view3.removeOnLayoutChangeListener((View.OnLayoutChangeListener) uv3VarZ0.f.getValue());
            }
            uv3VarZ0.c = null;
            uv3VarZ0.d = null;
            ((gm1) ((fm1) this.Y.getValue())).a.clear();
            el1 el1VarD0 = D0();
            ir1 ir1Var = el1VarD0.c;
            ((si9) ir1Var.r.getValue()).g(Boolean.FALSE);
            jpb jpbVar = ir1Var.j;
            jpbVar.b();
            a11 a11Var = (a11) ir1Var.b;
            CallsAudioManager callsAudioManager = (CallsAudioManager) a11Var.c.get();
            if (callsAudioManager != null) {
                callsAudioManager.setOnAudioDeviceChangeListener(null);
            }
            AudioLevelListener audioLevelListener = (AudioLevelListener) ir1Var.u.getValue();
            try {
                MicrophoneManager microphoneManagerC = a11Var.c();
                if (microphoneManagerC != null) {
                    microphoneManagerC.removeAudioSampleCallback(audioLevelListener);
                }
            } catch (Exception e) {
                hm9.l0("CallAudioController", "CallAudioController can't unregister mic audio listener due to: " + e.getMessage() + ".", e);
            }
            jpbVar.h.remove((dr1) ir1Var.x.getValue());
            jpbVar.g = null;
            x77 x77Var = (x77) ir1Var.v.T0(ir1Var, ir1.y[0]);
            if (x77Var != null) {
                x77Var.cancel(null);
            }
            ((ugf) el1VarD0.L0.getValue()).b();
            ((en1) el1VarD0.Q0.getValue()).a.clear();
            eo1 eo1Var = el1VarD0.Z;
            eo1Var.getClass();
            x77 x77Var2 = (x77) eo1Var.h.T0(eo1Var, eo1.k[0]);
            if (x77Var2 != null) {
                x77Var2.cancel(null);
            }
        }
        i1b i1bVar = this.z0;
        i1bVar.b.clear();
        i1bVar.a.clear();
        z0().c(true);
        od1 od1Var = this.O0;
        if (od1Var != null) {
            E0().g(od1Var);
        }
        uu3 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        if (zncVarT != null) {
            zncVarT.K((ji1) this.N0.getValue());
        }
        uu3 uu3VarB = u0().b();
        CallEventsWidget callEventsWidget = uu3VarB instanceof CallEventsWidget ? (CallEventsWidget) uu3VarB : null;
        if (callEventsWidget != null) {
            z0().a.remove(callEventsWidget);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        uu3 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        Continuation continuation = null;
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        if (zncVarT != null) {
            zncVarT.a((ji1) this.N0.getValue());
        }
        dy7.D(requireActivity(), true);
        ir1 ir1Var = D0().c;
        ir1Var.n();
        ir1Var.m();
        jpb jpbVar = ir1Var.j;
        jpbVar.a();
        jpbVar.h.add((dr1) ir1Var.x.getValue());
        jpbVar.g = new wmc(ir1Var, false);
        ir1Var.v.o1(ir1Var, ir1.y[0], od2.L(ir1Var.w, ir1Var.k));
        bc7[] bc7VarArr = S0;
        j03 j03Var = (j03) this.v0.T0(this, bc7VarArr[1]);
        boolean zF = tpa.f(j03Var.c(), "call_bottom_panel_widget_tag");
        String str = this.s0;
        if (!zF) {
            coc cocVar = new coc(new CallBottomPanelWidget(str, null), null, null, null, false, -1);
            cocVar.d("call_bottom_panel_widget_tag");
            j03Var.a.R(cocVar);
        }
        j03 j03Var2 = (j03) this.u0.T0(this, bc7VarArr[0]);
        if (!tpa.f(j03Var2.c(), "call_top_panel_widget_tag")) {
            coc cocVar2 = new coc(new CallTopPanelWidget(str, null), null, null, null, false, -1);
            cocVar2.d("call_top_panel_widget_tag");
            j03Var2.a.R(cocVar2);
        }
        pn1 pn1VarW0 = w0();
        if (pn1VarW0 != null) {
            en1 en1Var = (en1) D0().Q0.getValue();
            en1Var.a.add(pn1VarW0);
            ((CallTopPanelWidget) pn1VarW0).x(en1Var.b);
        }
        uu3 uu3VarB = u0().b();
        CallEventsWidget callEventsWidget = uu3VarB instanceof CallEventsWidget ? (CallEventsWidget) uu3VarB : null;
        if (callEventsWidget != null) {
            z0().b(callEventsWidget);
        }
        i3a i3aVarH = getRouter().h();
        if (i3aVarH != null) {
            i3aVarH.a(getViewLifecycleOwner(), new ru3(3, this));
        }
        ViewPager2 viewPager2E0 = E0();
        ViewStub viewStubB0 = B0();
        bc7 bc7Var = bc7VarArr[11];
        od1 od1Var = new od1(viewPager2E0, viewStubB0, (u21) this.M0.getValue(), (wd1) this.H0.getValue(), new di1(this, 0), new ci1(this, 9));
        E0().b(od1Var);
        this.O0 = od1Var;
        v0().setListener(new w4d(5, this));
        t0().setClickListener(new gaa(this));
        od2.L(new j31(D0().N0, new qw(new qw(D0().F0, 24), 25), new c3(this, continuation, 4), 4), getViewLifecycleScope());
        w7c w7cVar = D0().O0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new mi1(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(D0().F0, getViewLifecycleOwner().Q(), fg7Var), new ni1(null, this), 5), getViewLifecycleScope());
        if (!D0().u()) {
            od2.L(new zn5(tu0.g(D0().K0, getViewLifecycleOwner().Q(), fg7Var), new oi1(null, this), 5), getViewLifecycleScope());
        }
        od2.L(new zn5(tu0.g(D0().M0, getViewLifecycleOwner().Q(), fg7Var), new pi1(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(od2.x(new j31(D0().G0, D0().H0, new xi1(3, continuation, 0), 4)), getViewLifecycleOwner().Q(), fg7Var), new vi1(null, this), 5), getViewLifecycleScope());
    }

    public final void p0(boolean z) {
        z0().c(z);
    }

    public final void r0(CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        callWaitingRoomEventsWidget.a = z0();
        z0().b(callWaitingRoomEventsWidget);
        callWaitingRoomEventsWidget.Z = new f9(this, 8, callWaitingRoomEventsWidget);
    }

    public final void s0(boolean z) {
        if (z) {
            ((wr1) D0().c.a).v();
        }
        View viewRequireView = requireView();
        if (viewRequireView.getMeasuredWidth() == 0 || viewRequireView.getMeasuredHeight() == 0) {
            requireView().post(new b(22, this));
        } else {
            getRouter().B(this);
        }
    }

    public final q21 t0() {
        bc7 bc7Var = S0[6];
        return (q21) this.C0.getValue();
    }

    public final j03 u0() {
        return (j03) this.w0.T0(this, S0[2]);
    }

    public final dm1 v0() {
        bc7 bc7Var = S0[9];
        return (dm1) this.K0.getValue();
    }

    public final pn1 w0() {
        Object objB = ((j03) this.u0.T0(this, S0[0])).b();
        if (objB instanceof pn1) {
            return (pn1) objB;
        }
        return null;
    }

    public final j03 x0() {
        return (j03) this.y0.T0(this, S0[4]);
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        D0().Z.b(i, bundle);
    }

    public final bt1 y0() {
        return (bt1) this.a.getValue();
    }

    public final uv3 z0() {
        return (uv3) this.A0.getValue();
    }
}
