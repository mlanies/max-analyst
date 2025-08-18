package ru.ok.android.externcalls.sdk.api;

import defpackage.db7;
import defpackage.ig5;
import defpackage.za7;
import defpackage.zr6;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.externcalls.sdk.rate.RateCallData;

/* loaded from: classes2.dex */
public final class JoinByLinkResponse {
    public static final za7 PARSER = new ig5(27);
    public final String clientType;
    public final int deviceIndex;
    public final String endpoint;
    public final String id;
    public final boolean isP2PForbidden;
    public final List<PeerConnection.IceServer> stun;
    public final String token;
    public final List<PeerConnection.IceServer> turn;

    public JoinByLinkResponse(String str, List<PeerConnection.IceServer> list, List<PeerConnection.IceServer> list2, String str2, String str3, String str4, boolean z, int i) {
        this.id = str;
        this.deviceIndex = i;
        this.turn = list;
        this.endpoint = str2;
        this.token = str3;
        this.isP2PForbidden = z;
        this.stun = list2;
        this.clientType = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JoinByLinkResponse lambda$static$0(db7 db7Var) throws JsonParseException, IOException {
        List<PeerConnection.IceServer> listEmptyList = Collections.emptyList();
        List<PeerConnection.IceServer> listEmptyList2 = Collections.emptyList();
        db7Var.s();
        List<PeerConnection.IceServer> turn = listEmptyList;
        List<PeerConnection.IceServer> stun = listEmptyList2;
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        boolean zA0 = false;
        int iD = 0;
        while (db7Var.hasNext()) {
            String strT = db7Var.T();
            strT.getClass();
            switch (strT) {
                case "client_type":
                    strH4 = db7Var.H();
                    break;
                case "p2p_forbidden":
                    zA0 = db7Var.a0();
                    break;
                case "id":
                    strH = db7Var.H();
                    break;
                case "token":
                    strH3 = db7Var.H();
                    break;
                case "device_idx":
                    iD = db7Var.D();
                    break;
                case "turn_server":
                    turn = TurnStunParser.parseTurn(db7Var);
                    break;
                case "stun_server":
                    stun = TurnStunParser.parseStun(db7Var);
                    break;
                case "endpoint":
                    strH2 = db7Var.H();
                    break;
                default:
                    db7Var.z();
                    break;
            }
        }
        db7Var.q();
        return new JoinByLinkResponse(strH, turn, stun, strH2, strH3, strH4, zA0, iD);
    }

    public ConversationParams toParams(ConversationParams conversationParams) {
        ConversationParams conversationParams2 = new ConversationParams();
        LinkedList linkedList = new LinkedList(this.turn);
        if (conversationParams != null) {
            conversationParams2.rateCallData = conversationParams.rateCallData;
            linkedList.addAll(conversationParams.stunTurnServers);
        } else {
            conversationParams2.rateCallData = new RateCallData(0, Collections.emptyList());
        }
        conversationParams2.endpoint = this.endpoint;
        conversationParams2.deviceIndex = this.deviceIndex;
        conversationParams2.token = this.token;
        conversationParams2.stunTurnServers = linkedList;
        return conversationParams2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JoinByLinkResponse{id='");
        sb.append(this.id);
        sb.append("', deviceIndex='");
        sb.append(this.deviceIndex);
        sb.append("', turn=");
        sb.append(this.turn);
        sb.append(", endpoint='");
        sb.append(this.endpoint);
        sb.append("', token='");
        return zr6.l(sb, this.token, "'}");
    }

    public ConversationParams toParams() {
        ConversationParams conversationParams = new ConversationParams();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.turn);
        linkedList.addAll(this.stun);
        conversationParams.id = this.id;
        conversationParams.clientType = this.clientType;
        conversationParams.endpoint = this.endpoint;
        conversationParams.deviceIndex = this.deviceIndex;
        conversationParams.token = this.token;
        conversationParams.stunTurnServers = linkedList;
        conversationParams.isP2PForbidden = this.isP2PForbidden;
        return conversationParams;
    }
}
