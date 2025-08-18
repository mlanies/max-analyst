package defpackage;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f36 implements s65, t65 {
    public static final av1 X = new av1();
    public static final av1 Y = new av1();
    public final /* synthetic */ int a;
    public final UUID b;
    public final MediaDrm c;
    public int o;

    public f36(UUID uuid, int i) {
        this.a = i;
        switch (i) {
            case 1:
                uuid.getClass();
                UUID uuid2 = ew0.b;
                fm9.e("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
                this.b = uuid;
                MediaDrm mediaDrm = new MediaDrm((oaf.a >= 27 || !ew0.c.equals(uuid)) ? uuid : uuid2);
                this.c = mediaDrm;
                this.o = 1;
                if (ew0.d.equals(uuid) && "ASUS_Z00AD".equals(oaf.d)) {
                    mediaDrm.setPropertyString("securityLevel", "L3");
                    break;
                }
                break;
            default:
                uuid.getClass();
                UUID uuid3 = bw0.b;
                np8.c("Use C.CLEARKEY_UUID instead", !uuid3.equals(uuid));
                this.b = uuid;
                MediaDrm mediaDrm2 = new MediaDrm((maf.a >= 27 || !bw0.c.equals(uuid)) ? uuid : uuid3);
                this.c = mediaDrm2;
                this.o = 1;
                if (bw0.d.equals(uuid) && "ASUS_Z00AD".equals(maf.d)) {
                    mediaDrm2.setPropertyString("securityLevel", "L3");
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s65
    public final Map a(byte[] bArr) {
        switch (this.a) {
        }
        return this.c.queryKeyStatus(bArr);
    }

    public boolean b() {
        return oaf.a < 21 && ew0.d.equals(this.b) && "L3".equals(this.c.getPropertyString("securityLevel"));
    }

    @Override // defpackage.s65
    public q65 d() {
        MediaDrm.ProvisionRequest provisionRequest = this.c.getProvisionRequest();
        return new q65(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // defpackage.s65
    public pz3 f(byte[] bArr) {
        int i = maf.a;
        UUID uuid = this.b;
        boolean z = i < 21 && bw0.d.equals(uuid) && "L3".equals(this.c.getPropertyString("securityLevel"));
        if (i < 27 && bw0.c.equals(uuid)) {
            uuid = bw0.b;
        }
        return new a36(uuid, bArr, z);
    }

    @Override // defpackage.s65
    public final byte[] g() {
        switch (this.a) {
        }
        return this.c.openSession();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @Override // defpackage.s65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(byte[] r7, java.lang.String r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L7a;
                default: goto L5;
            }
        L5:
            int r0 = defpackage.oaf.a
            r1 = 31
            r2 = 0
            java.util.UUID r3 = r6.b
            r4 = 1
            if (r0 < r1) goto L50
            java.util.UUID r0 = defpackage.ew0.d
            boolean r0 = r3.equals(r0)
            android.media.MediaDrm r1 = r6.c
            if (r0 == 0) goto L43
            java.lang.String r0 = "version"
            java.lang.String r0 = r1.getPropertyString(r0)
            java.lang.String r5 = "v5."
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L41
            java.lang.String r5 = "14."
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L41
            java.lang.String r5 = "15."
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L41
            java.lang.String r5 = "16.0"
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L41
            r0 = r4
            goto L49
        L41:
            r0 = r2
            goto L49
        L43:
            java.util.UUID r0 = defpackage.ew0.c
            boolean r0 = r3.equals(r0)
        L49:
            if (r0 == 0) goto L50
            boolean r7 = defpackage.e36.a(r1, r8)
            goto L70
        L50:
            r0 = 0
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch: java.lang.Throwable -> L63 android.media.MediaCryptoException -> L6a
            r1.<init>(r3, r7)     // Catch: java.lang.Throwable -> L63 android.media.MediaCryptoException -> L6a
            boolean r7 = r1.requiresSecureDecoderComponent(r8)     // Catch: java.lang.Throwable -> L5e android.media.MediaCryptoException -> L61
            r1.release()
            goto L70
        L5e:
            r6 = move-exception
            r0 = r1
            goto L64
        L61:
            r0 = r1
            goto L6a
        L63:
            r6 = move-exception
        L64:
            if (r0 == 0) goto L69
            r0.release()
        L69:
            throw r6
        L6a:
            if (r0 == 0) goto L6f
            r0.release()
        L6f:
            r7 = r4
        L70:
            if (r7 == 0) goto L79
            boolean r6 = r6.b()
            if (r6 != 0) goto L79
            r2 = r4
        L79:
            return r2
        L7a:
            int r0 = defpackage.maf.a
            r1 = 31
            if (r0 < r1) goto L87
            android.media.MediaDrm r6 = r6.c
            boolean r6 = defpackage.d36.a(r6, r8)
            goto L9c
        L87:
            android.media.MediaCrypto r0 = new android.media.MediaCrypto     // Catch: android.media.MediaCryptoException -> L9b
            java.util.UUID r6 = r6.b     // Catch: android.media.MediaCryptoException -> L9b
            r0.<init>(r6, r7)     // Catch: android.media.MediaCryptoException -> L9b
            boolean r6 = r0.requiresSecureDecoderComponent(r8)     // Catch: java.lang.Throwable -> L96
            r0.release()
            goto L9c
        L96:
            r6 = move-exception
            r0.release()
            throw r6
        L9b:
            r6 = 1
        L9c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f36.i(byte[], java.lang.String):boolean");
    }

    @Override // defpackage.s65
    public final void j(byte[] bArr, byte[] bArr2) {
        switch (this.a) {
            case 0:
                this.c.restoreKeys(bArr, bArr2);
                break;
            default:
                this.c.restoreKeys(bArr, bArr2);
                break;
        }
    }

    @Override // defpackage.s65
    public final void k(byte[] bArr) {
        switch (this.a) {
            case 0:
                this.c.closeSession(bArr);
                break;
            default:
                this.c.closeSession(bArr);
                break;
        }
    }

    @Override // defpackage.s65
    public final byte[] l(byte[] bArr, byte[] bArr2) {
        switch (this.a) {
            case 0:
                if (bw0.c.equals(this.b) && maf.a < 27) {
                    try {
                        JSONObject jSONObject = new JSONObject(maf.n(bArr2));
                        StringBuilder sb = new StringBuilder("{\"keys\":[");
                        JSONArray jSONArray = jSONObject.getJSONArray("keys");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            if (i != 0) {
                                sb.append(",");
                            }
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            sb.append("{\"k\":\"");
                            sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                            sb.append("\",\"kid\":\"");
                            sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                            sb.append("\",\"kty\":\"");
                            sb.append(jSONObject2.getString("kty"));
                            sb.append("\"}");
                        }
                        sb.append("]}");
                        bArr2 = sb.toString().getBytes(b52.c);
                    } catch (JSONException e) {
                        String strN = maf.n(bArr2);
                        fm9.c(strN.length() != 0 ? "Failed to adjust response data: ".concat(strN) : new String("Failed to adjust response data: "), e);
                    }
                }
                return this.c.provideKeyResponse(bArr, bArr2);
            default:
                if (ew0.c.equals(this.b) && oaf.a < 27) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(oaf.q(bArr2));
                        StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("keys");
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            if (i2 != 0) {
                                sb2.append(",");
                            }
                            JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                            sb2.append("{\"k\":\"");
                            sb2.append(jSONObject4.getString("k").replace('-', '+').replace('_', '/'));
                            sb2.append("\",\"kid\":\"");
                            sb2.append(jSONObject4.getString("kid").replace('-', '+').replace('_', '/'));
                            sb2.append("\",\"kty\":\"");
                            sb2.append(jSONObject4.getString("kty"));
                            sb2.append("\"}");
                        }
                        sb2.append("]}");
                        bArr2 = sb2.toString().getBytes(b52.c);
                    } catch (JSONException e2) {
                        z04.v("Failed to adjust response data: ".concat(oaf.q(bArr2)), e2);
                    }
                }
                return this.c.provideKeyResponse(bArr, bArr2);
        }
    }

    @Override // defpackage.s65
    public final void m(byte[] bArr) throws DeniedByServerException {
        switch (this.a) {
            case 0:
                this.c.provideProvisionResponse(bArr);
                break;
            default:
                this.c.provideProvisionResponse(bArr);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0192  */
    @Override // defpackage.s65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.o65 n(byte[] r16, java.util.List r17, int r18, java.util.HashMap r19) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f36.n(byte[], java.util.List, int, java.util.HashMap):o65");
    }

    @Override // defpackage.s65
    public final int o() {
        switch (this.a) {
        }
        return 2;
    }

    @Override // defpackage.s65
    public void p(sy4 sy4Var) {
        this.c.setOnEventListener(new c36(this, 0, sy4Var));
    }

    @Override // defpackage.s65
    public final synchronized void release() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    int i2 = this.o - 1;
                    this.o = i2;
                    if (i2 == 0) {
                        this.c.release();
                    }
                    return;
                default:
                    int i3 = this.o - 1;
                    this.o = i3;
                    if (i3 == 0) {
                        this.c.release();
                    }
                    return;
            }
        }
    }

    @Override // defpackage.s65
    public void t(byte[] bArr, i4b i4bVar) {
        if (maf.a >= 31) {
            d36.b(this.c, bArr, i4bVar);
        }
    }

    @Override // defpackage.t65
    public void x(wd6 wd6Var) {
        this.c.setOnEventListener(new c36(this, 1, wd6Var));
    }

    @Override // defpackage.t65
    public void z(byte[] bArr, j4b j4bVar) {
        if (oaf.a >= 31) {
            try {
                e36.b(this.c, bArr, j4bVar);
            } catch (UnsupportedOperationException unused) {
                z04.c0("setLogSessionId failed.");
            }
        }
    }

    @Override // defpackage.t65
    /* renamed from: d, reason: collision with other method in class */
    public r65 mo2d() {
        MediaDrm.ProvisionRequest provisionRequest = this.c.getProvisionRequest();
        return new r65(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // defpackage.t65
    /* renamed from: f, reason: collision with other method in class */
    public qz3 mo3f(byte[] bArr) {
        b();
        int i = oaf.a;
        UUID uuid = this.b;
        if (i < 27 && ew0.c.equals(uuid)) {
            uuid = ew0.b;
        }
        return new b36(uuid, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    @Override // defpackage.t65
    /* renamed from: n, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.p65 mo4n(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f36.mo4n(byte[], java.util.List, int, java.util.HashMap):p65");
    }
}
