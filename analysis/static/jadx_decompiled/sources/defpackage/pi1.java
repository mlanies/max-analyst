package defpackage;

import android.media.projection.MediaProjectionManager;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* loaded from: classes.dex */
public final class pi1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        pi1 pi1Var = (pi1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        pi1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        pi1 pi1Var = new pi1(continuation, this.Y);
        pi1Var.X = obj;
        return pi1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [uu3] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v8, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94, types: [uu3] */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Boolean, z84] */
    /* JADX WARN: Type inference failed for: r6v1, types: [znc] */
    /* JADX WARN: Type inference failed for: r6v2, types: [znc] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Long l;
        int i = 2;
        int i2 = 1;
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof wj1) {
            wj1 wj1Var = (wj1) wm9Var;
            yxc yxcVar = CallScreen.R0;
            CallScreen callScreen = this.Y;
            callScreen.getClass();
            if (wj1Var instanceof gj1) {
                bc7[] bc7VarArr = BottomSheetWidget.x0;
                ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = new ConfirmAddOpponentToCallBottomSheet();
                confirmAddOpponentToCallBottomSheet.setTargetController(callScreen);
                ?? parentController = callScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                confirmAddOpponentToCallBottomSheet.z0(callScreen);
                if (zncVarT != null) {
                    coc cocVar = new coc(confirmAddOpponentToCallBottomSheet, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                }
            } else if (wj1Var instanceof kj1) {
                bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = new ConfirmRemoveOpponentToCallBottomSheet(((kj1) wj1Var).D, callScreen.z0().k.b());
                confirmRemoveOpponentToCallBottomSheet.setTargetController(callScreen);
                ?? parentController2 = callScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                foc focVar2 = parentController2 instanceof foc ? (foc) parentController2 : null;
                znc zncVarT2 = focVar2 != null ? focVar2.T() : null;
                confirmRemoveOpponentToCallBottomSheet.z0(callScreen);
                if (zncVarT2 != null) {
                    coc cocVar2 = new coc(confirmRemoveOpponentToCallBottomSheet, null, null, null, false, -1);
                    wg0.l(false, cocVar2, true, "BottomSheetWidget");
                    zncVarT2.G(cocVar2);
                }
            } else if (wj1Var instanceof tj1) {
                v31 v31Var = ((tj1) wj1Var).D;
                qt3 qt3VarS = dy7.c(1).y().S(v31Var.a).s();
                if (v31Var.d != null) {
                    qt3VarS.L(r3.x, r3.y);
                }
                qt3VarS.I(v31Var.b).build().q(callScreen);
            } else {
                boolean z = wj1Var instanceof uj1;
                je7 je7Var = callScreen.P0;
                if (z) {
                    tnd tndVar = (tnd) je7Var.getValue();
                    int iB = callScreen.z0().k.b();
                    tndVar.getClass();
                    tnd.b(dj1.a, new s25((uj1) wj1Var, callScreen, iB, i));
                } else if (wj1Var instanceof vj1) {
                    tnd tndVar2 = (tnd) je7Var.getValue();
                    int iB2 = callScreen.z0().k.b();
                    tndVar2.getClass();
                    tnd.b(dj1.b, new s25(callScreen, (vj1) wj1Var, iB2, i2));
                } else if (wj1Var instanceof ij1) {
                    m31 m31Var = callScreen.D0().s().f;
                    Long l2 = m31Var != null ? m31Var.a : null;
                    if (l2 != null) {
                        bt1 bt1VarY0 = callScreen.y0();
                        String str = callScreen.D0().s().a;
                        boolean z2 = callScreen.D0().s().g;
                        bt1VarY0.getClass();
                        bt1.c(bt1VarY0, "PROFILE_OPENED", str, null, null, null, null, z2, 60);
                        je1.c.P1().b(ey8.i(l2.longValue(), ":profile?id=", "&type=local_chat"), null);
                    }
                } else if (wj1Var instanceof hj1) {
                    el1 el1VarD0 = callScreen.D0();
                    m31 m31Var2 = el1VarD0.s().f;
                    if (m31Var2 != null && (l = m31Var2.a) != null) {
                        long jLongValue = l.longValue();
                        bt1 bt1Var = (bt1) el1VarD0.v0.getValue();
                        String str2 = el1VarD0.s().a;
                        boolean z3 = el1VarD0.s().g;
                        bt1Var.getClass();
                        bt1.c(bt1Var, "CHAT_OPENED", str2, null, null, null, null, z3, 60);
                        je1.c.getClass();
                        pnf.o(el1VarD0.M0, new c64(":chats?id=" + jLongValue + "&type=local"));
                    }
                } else if (wj1Var instanceof aj1) {
                    callScreen.s0(true);
                } else if (wj1Var instanceof rj1) {
                    boolean z4 = ((rj1) wj1Var).D;
                    boolean zA = callScreen.D0().s().i.a();
                    if (!z4 && zA) {
                        callScreen.D0().w(false, null);
                    } else if (!z4 || !zA) {
                        Object systemService = callScreen.requireActivity().getSystemService("media_projection");
                        MediaProjectionManager mediaProjectionManager = systemService instanceof MediaProjectionManager ? (MediaProjectionManager) systemService : null;
                        if (mediaProjectionManager == null) {
                            el1 el1VarD02 = callScreen.D0();
                            el1VarD02.getClass();
                            pnf.o(el1VarD02.M0, wj1.q);
                        } else {
                            callScreen.startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 1);
                        }
                    }
                } else if (wj1Var instanceof mj1) {
                    el1 el1VarD03 = callScreen.D0();
                    CharSequence charSequence = ((mj1) wj1Var).D;
                    ir1 ir1Var = el1VarD03.c;
                    ir1Var.getClass();
                    RecordManager.StartParams startParamsBuild = new RecordManager.StartParams.Builder().isStream(false).withName(charSequence).build();
                    vvc vvcVar = (vvc) ir1Var.i;
                    vvcVar.getClass();
                    hm9.h0("ScreenRecordControllerTag", "startRecordBroadcast", new Object[0]);
                    ReentrantLock reentrantLock = vvcVar.Z;
                    reentrantLock.lock();
                    try {
                        if (((wvc) vvcVar.t0.getValue()).a == xvc.a) {
                            hm9.h0("ScreenRecordControllerTag", "startRecordBroadcast already started", new Object[0]);
                        } else {
                            bt1 bt1Var2 = (bt1) vvcVar.X.getValue();
                            bt1Var2.getClass();
                            bt1.c(bt1Var2, "CALL_RECORDING", null, null, 1L, null, null, true, 54);
                            RecordManager recordManagerB = vvcVar.b();
                            if (recordManagerB != null) {
                                RecordManager.startRecord$default(recordManagerB, startParamsBuild, null, null, 6, null);
                            }
                            reentrantLock.unlock();
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                } else if (wj1Var instanceof cj1) {
                    callScreen.s0(false);
                } else if (wj1Var instanceof bj1) {
                    callScreen.D0().c.a(((bj1) wj1Var).D);
                } else {
                    boolean z5 = wj1Var instanceof sj1;
                    String str3 = callScreen.s0;
                    if (z5) {
                        je1.c.P1().b(":call-opponents-list?arg_key_scope_id=".concat(str3), null);
                    } else if (wj1Var instanceof ej1) {
                        tpa.o(callScreen.getContext(), ((ej1) wj1Var).D);
                        if (tpa.s()) {
                            String string = callScreen.getContext().getString(f0c.call_link_share_dialog_share_link_copy);
                            wha whaVar = new wha(callScreen);
                            whaVar.h(string);
                            whaVar.d(new ho1(3, null));
                            whaVar.c(new eia(0, 0, 0, 3));
                            whaVar.i();
                        }
                    } else if (wj1Var instanceof oj1) {
                        bc7[] bc7VarArr3 = BottomSheetWidget.x0;
                        CallMoreBottomSheet callMoreBottomSheet = new CallMoreBottomSheet(str3, be1.b, null);
                        callMoreBottomSheet.setTargetController(callScreen);
                        ?? parentController3 = callScreen;
                        while (parentController3.getParentController() != null) {
                            parentController3 = parentController3.getParentController();
                        }
                        foc focVar3 = parentController3 instanceof foc ? (foc) parentController3 : null;
                        znc zncVarT3 = focVar3 != null ? focVar3.T() : null;
                        if (zncVarT3 != null) {
                            coc cocVar3 = new coc(callMoreBottomSheet, null, null, null, false, -1);
                            wg0.l(false, cocVar3, true, "BottomSheetWidget");
                            zncVarT3.G(cocVar3);
                        }
                    } else if (wj1Var instanceof lj1) {
                        bc7[] bc7VarArr4 = BottomSheetWidget.x0;
                        RaiseHandActionBottomSheet raiseHandActionBottomSheet = new RaiseHandActionBottomSheet(str3, ((lj1) wj1Var).D, null);
                        raiseHandActionBottomSheet.setTargetController(callScreen);
                        ?? parentController4 = callScreen;
                        while (parentController4.getParentController() != null) {
                            parentController4 = parentController4.getParentController();
                        }
                        foc focVar4 = parentController4 instanceof foc ? (foc) parentController4 : null;
                        znc zncVarT4 = focVar4 != null ? focVar4.T() : null;
                        raiseHandActionBottomSheet.z0(callScreen);
                        if (zncVarT4 != null) {
                            coc cocVar4 = new coc(raiseHandActionBottomSheet, null, null, null, false, -1);
                            wg0.l(false, cocVar4, true, "BottomSheetWidget");
                            zncVarT4.G(cocVar4);
                        }
                    } else if (wj1Var instanceof nj1) {
                        bc7[] bc7VarArr5 = BottomSheetWidget.x0;
                        StartRecordBottomSheet startRecordBottomSheet = new StartRecordBottomSheet(str3, null);
                        startRecordBottomSheet.setTargetController(callScreen);
                        ?? parentController5 = callScreen;
                        while (parentController5.getParentController() != null) {
                            parentController5 = parentController5.getParentController();
                        }
                        foc focVar5 = parentController5 instanceof foc ? (foc) parentController5 : null;
                        znc zncVarT5 = focVar5 != null ? focVar5.T() : null;
                        startRecordBottomSheet.z0(callScreen);
                        if (zncVarT5 != null) {
                            coc cocVar5 = new coc(startRecordBottomSheet, null, null, null, false, -1);
                            wg0.l(false, cocVar5, true, "BottomSheetWidget");
                            zncVarT5.G(cocVar5);
                        }
                    } else if (wj1Var instanceof pj1) {
                        bc7[] bc7VarArr6 = BottomSheetWidget.x0;
                        RecordExitBottomSheet recordExitBottomSheet = new RecordExitBottomSheet(ccc.b, T, i, T);
                        recordExitBottomSheet.setTargetController(callScreen);
                        ?? parentController6 = callScreen;
                        while (parentController6.getParentController() != null) {
                            parentController6 = parentController6.getParentController();
                        }
                        foc focVar6 = parentController6 instanceof foc ? (foc) parentController6 : null;
                        znc zncVarT6 = focVar6 != null ? focVar6.T() : null;
                        recordExitBottomSheet.z0(callScreen);
                        if (zncVarT6 != null) {
                            coc cocVar6 = new coc(recordExitBottomSheet, null, null, null, false, -1);
                            wg0.l(false, cocVar6, true, "BottomSheetWidget");
                            zncVarT6.G(cocVar6);
                        }
                    } else if (wj1Var instanceof fj1) {
                        bc7[] bc7VarArr7 = BottomSheetWidget.x0;
                        RecordExitBottomSheet recordExitBottomSheet2 = new RecordExitBottomSheet(ccc.a, T, i, T);
                        recordExitBottomSheet2.setTargetController(callScreen);
                        ?? parentController7 = callScreen;
                        while (parentController7.getParentController() != null) {
                            parentController7 = parentController7.getParentController();
                        }
                        foc focVar7 = parentController7 instanceof foc ? (foc) parentController7 : null;
                        znc zncVarT7 = focVar7 != null ? focVar7.T() : null;
                        recordExitBottomSheet2.z0(callScreen);
                        if (zncVarT7 != null) {
                            coc cocVar7 = new coc(recordExitBottomSheet2, null, null, null, false, -1);
                            wg0.l(false, cocVar7, true, "BottomSheetWidget");
                            zncVarT7.G(cocVar7);
                        }
                    } else if (wj1Var instanceof jj1) {
                        bc7[] bc7VarArr8 = BottomSheetWidget.x0;
                        CallMoreBottomSheet callMoreBottomSheet2 = new CallMoreBottomSheet(str3, be1.a, null);
                        callMoreBottomSheet2.setTargetController(callScreen);
                        ?? parentController8 = callScreen;
                        while (parentController8.getParentController() != null) {
                            parentController8 = parentController8.getParentController();
                        }
                        foc focVar8 = parentController8 instanceof foc ? (foc) parentController8 : null;
                        T = focVar8 != null ? focVar8.T() : 0;
                        if (T != 0) {
                            coc cocVar8 = new coc(callMoreBottomSheet2, null, null, null, false, -1);
                            wg0.l(false, cocVar8, true, "BottomSheetWidget");
                            T.G(cocVar8);
                        }
                    } else {
                        if (!(wj1Var instanceof qj1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        je1.c.Z1(((qj1) wj1Var).D, callScreen.getContext().getString(b8a.O1), CallScreen.class.getName());
                    }
                }
            }
        } else if (wm9Var instanceof c64) {
            je1.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
