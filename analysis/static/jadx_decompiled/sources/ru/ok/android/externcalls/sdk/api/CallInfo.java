package ru.ok.android.externcalls.sdk.api;

import defpackage.au1;
import defpackage.db7;
import defpackage.un0;
import defpackage.za7;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* loaded from: classes2.dex */
public class CallInfo {
    public static final za7 PARSER = new un0(7);
    public final String clientType;
    public final int deviceIndex;
    public final String endpoint;
    public final String id;
    public final boolean isConcurrent;
    public final boolean isP2PForbidden;
    public final String joinLink;
    public final List<PeerConnection.IceServer> stunServer;
    public final String token;
    public final List<PeerConnection.IceServer> turnServer;

    private CallInfo(String str, String str2, String str3, String str4, String str5, boolean z, List<PeerConnection.IceServer> list, List<PeerConnection.IceServer> list2, boolean z2, int i) {
        this.token = str;
        this.clientType = str2;
        this.endpoint = str3;
        this.id = str4;
        this.joinLink = str5;
        this.isConcurrent = z;
        this.turnServer = list;
        this.stunServer = list2;
        this.isP2PForbidden = z2;
        this.deviceIndex = i;
    }

    public static CallInfo parse(db7 db7Var) throws JsonTypeMismatchException, IOException {
        List<PeerConnection.IceServer> listEmptyList = Collections.emptyList();
        List<PeerConnection.IceServer> listEmptyList2 = Collections.emptyList();
        db7Var.s();
        List<PeerConnection.IceServer> turn = listEmptyList;
        List<PeerConnection.IceServer> stun = listEmptyList2;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        String strH5 = null;
        boolean zA0 = false;
        boolean zA02 = false;
        int iD = 0;
        while (db7Var.hasNext()) {
            String strT = db7Var.T();
            strT.getClass();
            switch (strT) {
                case "join_link":
                    strH5 = db7Var.H();
                    break;
                case "client_type":
                    strH2 = db7Var.H();
                    break;
                case "p2p_forbidden":
                    zA02 = db7Var.a0();
                    break;
                case "id":
                    strH4 = db7Var.H();
                    break;
                case "token":
                    strH = db7Var.H();
                    break;
                case "device_idx":
                    iD = db7Var.D();
                    break;
                case "is_concurrent":
                    zA0 = db7Var.a0();
                    break;
                case "turn_server":
                    turn = TurnStunParser.parseTurn(db7Var);
                    break;
                case "stun_server":
                    stun = TurnStunParser.parseStun(db7Var);
                    break;
                case "endpoint":
                    strH3 = db7Var.H();
                    break;
                default:
                    db7Var.z();
                    break;
            }
        }
        db7Var.q();
        return new CallInfo(strH, strH2, strH3, strH4, strH5, zA0, turn, stun, zA02, iD);
    }

    public String getFormattedJoinLink(String str) {
        StringBuilder sbL = au1.l(str);
        sbL.append(this.joinLink);
        return sbL.toString();
    }

    public ConversationParams toParams() {
        ConversationParams conversationParams = new ConversationParams();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.turnServer);
        linkedList.addAll(this.stunServer);
        conversationParams.id = this.id;
        conversationParams.clientType = this.clientType;
        conversationParams.endpoint = this.endpoint;
        conversationParams.token = this.token;
        conversationParams.stunTurnServers = linkedList;
        return conversationParams;
    }
}
