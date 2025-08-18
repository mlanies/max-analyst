package defpackage;

import android.os.Handler;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final /* synthetic */ class ik4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kk4 b;

    public /* synthetic */ ik4(kk4 kk4Var, int i) {
        this.a = i;
        this.b = kk4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kk4 kk4Var = this.b;
                for (nsa nsaVar : kk4Var.K0.values()) {
                    kk4Var.Z(nsaVar, nsaVar.C());
                }
                break;
            default:
                kk4 kk4Var2 = this.b;
                if (kk4Var2.I()) {
                    for (Map.Entry entry : kk4Var2.K0.entrySet()) {
                        bg1 bg1Var = (bg1) entry.getKey();
                        if (((nsa) entry.getValue()).C() != PeerConnection.IceConnectionState.CONNECTED) {
                            fg1 fg1VarZ = kk4Var2.z(bg1Var);
                            kk4Var2.b = true;
                            jb9.d(kk4Var2.X, "DIRECT_CONNECTION_TIMEOUT", fg1VarZ != null ? fg1VarZ.k : null);
                            xn1 xn1Var = kk4Var2.y0;
                            if (xn1Var != null) {
                                py0 py0Var = (py0) xn1Var;
                                if (kk4Var2.H(xxe.b)) {
                                    py0Var.V0.log("OKRTCCall", "onTopologyUpgradeProposed");
                                    rod rodVar = py0Var.Z;
                                    ka6 ka6VarB = f46.b(null, "switch-topology");
                                    JSONObject jSONObject = ka6VarB.a;
                                    try {
                                        jSONObject.put("topology", "SERVER");
                                        jSONObject.put("force", false);
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                    rodVar.i(ka6VarB);
                                    Handler handler = py0Var.s0;
                                    gwe gweVar = py0Var.J0;
                                    handler.removeCallbacks(gweVar);
                                    py0Var.u0.b.getClass();
                                    handler.postDelayed(gweVar, 30000);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }
}
