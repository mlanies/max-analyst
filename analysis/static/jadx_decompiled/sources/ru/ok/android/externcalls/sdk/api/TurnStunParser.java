package ru.ok.android.externcalls.sdk.api;

import defpackage.db7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/api/TurnStunParser;", "", "<init>", "()V", "Ldb7;", "reader", "", "Lorg/webrtc/PeerConnection$IceServer;", "parseTurn", "(Ldb7;)Ljava/util/List;", "parseStun", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class TurnStunParser {
    public static final TurnStunParser INSTANCE = new TurnStunParser();

    private TurnStunParser() {
    }

    public static final List<PeerConnection.IceServer> parseStun(db7 reader) throws JsonTypeMismatchException, IOException {
        ArrayList<String> arrayList = new ArrayList();
        reader.s();
        while (reader.hasNext()) {
            String strT = reader.T();
            if (strT.hashCode() == 3598564 && strT.equals("urls")) {
                reader.u();
                while (reader.hasNext()) {
                    arrayList.add(reader.H());
                }
                reader.t();
            } else {
                reader.z();
            }
        }
        reader.q();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (str.length() != 0) {
                arrayList2.add(PeerConnection.IceServer.builder(str).createIceServer());
            }
        }
        return arrayList2;
    }

    public static final List<PeerConnection.IceServer> parseTurn(db7 reader) throws JsonTypeMismatchException, IOException {
        ArrayList<String> arrayList = new ArrayList();
        reader.s();
        String strF0 = null;
        String strF02 = null;
        while (reader.hasNext()) {
            String strT = reader.T();
            int iHashCode = strT.hashCode();
            if (iHashCode != -683415465) {
                if (iHashCode != -265713450) {
                    if (iHashCode == 3598564 && strT.equals("urls")) {
                        reader.u();
                        while (reader.hasNext()) {
                            arrayList.add(reader.H());
                        }
                        reader.t();
                    } else {
                        reader.z();
                    }
                } else if (strT.equals("username")) {
                    strF02 = reader.f0();
                } else {
                    reader.z();
                }
            } else if (strT.equals("credential")) {
                strF0 = reader.f0();
            } else {
                reader.z();
            }
        }
        reader.q();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (str.length() != 0) {
                arrayList2.add(PeerConnection.IceServer.builder(str).setUsername(strF02).setPassword(strF0).setTlsCertPolicy(PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE).createIceServer());
            }
        }
        return arrayList2;
    }
}
