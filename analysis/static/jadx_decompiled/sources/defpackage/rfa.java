package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;

/* loaded from: classes2.dex */
public final class rfa extends oy {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ ilc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfa(WorkDatabase_Impl workDatabase_Impl) {
        super(16, 5);
        this.o = workDatabase_Impl;
    }

    private final yx8 v(k36 k36Var) {
        HashMap map = new HashMap(13);
        map.put("attach_local_id", new ije(0, 1, "attach_local_id", "TEXT", null, false));
        map.put("prepared_path", new ije(0, 1, "prepared_path", "TEXT", null, false));
        map.put("file_name", new ije(0, 1, "file_name", "TEXT", null, false));
        map.put("upload_url", new ije(0, 1, "upload_url", "TEXT", null, false));
        map.put("upload_progress", new ije(0, 1, "upload_progress", "REAL", null, true));
        map.put("total_bytes", new ije(0, 1, "total_bytes", "INTEGER", null, true));
        map.put("upload_status", new ije(0, 1, "upload_status", "INTEGER", null, false));
        map.put("created_time", new ije(0, 1, "created_time", "INTEGER", null, true));
        map.put(ClientCookie.PATH_ATTR, new ije(1, 1, ClientCookie.PATH_ATTR, "TEXT", null, true));
        map.put("last_modified", new ije(2, 1, "last_modified", "INTEGER", null, true));
        map.put("upload_type", new ije(3, 1, "upload_type", "INTEGER", null, true));
        map.put("photo_token", new ije(0, 1, "photo_token", "TEXT", null, false));
        mje mjeVar = new mje("uploads", map, h4f.o(map, "attach_id", new ije(0, 1, "attach_id", "INTEGER", null, false), 0), new HashSet(0));
        mje mjeVarA = mje.a(k36Var, "uploads");
        if (!mjeVar.equals(mjeVarA)) {
            return new yx8(h4f.n("uploads(ru.ok.tamtam.android.upload.UploadDb).\n Expected:\n", mjeVar, "\n Found:\n", mjeVarA), false);
        }
        HashMap map2 = new HashMap(10);
        map2.put(ClientCookie.PATH_ATTR, new ije(0, 1, ClientCookie.PATH_ATTR, "TEXT", null, false));
        map2.put("last_modified", new ije(0, 1, "last_modified", "INTEGER", null, true));
        map2.put("upload_type", new ije(0, 1, "upload_type", "INTEGER", null, false));
        map2.put("message_id", new ije(1, 1, "message_id", "INTEGER", null, true));
        map2.put("chat_id", new ije(2, 1, "chat_id", "INTEGER", null, true));
        map2.put("attach_id", new ije(3, 1, "attach_id", "TEXT", null, true));
        map2.put("video_quality", new ije(0, 1, "video_quality", "INTEGER", null, false));
        map2.put("video_start_trim_position", new ije(0, 1, "video_start_trim_position", "REAL", null, false));
        map2.put("video_end_trim_position", new ije(0, 1, "video_end_trim_position", "REAL", null, false));
        mje mjeVar2 = new mje("message_uploads", map2, h4f.o(map2, "mute", new ije(0, 1, "mute", "INTEGER", "false", false), 0), new HashSet(0));
        mje mjeVarA2 = mje.a(k36Var, "message_uploads");
        if (!mjeVar2.equals(mjeVarA2)) {
            return new yx8(h4f.n("message_uploads(ru.ok.tamtam.android.upload.message.MessageUploadDb).\n Expected:\n", mjeVar2, "\n Found:\n", mjeVarA2), false);
        }
        HashMap map3 = new HashMap(8);
        map3.put("finished", new ije(0, 1, "finished", "INTEGER", null, true));
        map3.put("prepared_path", new ije(0, 1, "prepared_path", "TEXT", null, false));
        map3.put("result_path", new ije(0, 1, "result_path", "TEXT", null, false));
        map3.put("source_uri", new ije(1, 1, "source_uri", "TEXT", null, true));
        map3.put("quality", new ije(2, 1, "quality", "INTEGER", null, true));
        map3.put("start_trim_position", new ije(3, 1, "start_trim_position", "REAL", null, true));
        map3.put("end_trim_position", new ije(4, 1, "end_trim_position", "REAL", null, true));
        mje mjeVar3 = new mje("video_conversions", map3, h4f.o(map3, "mute", new ije(5, 1, "mute", "INTEGER", "false", true), 0), new HashSet(0));
        mje mjeVarA3 = mje.a(k36Var, "video_conversions");
        if (!mjeVar3.equals(mjeVarA3)) {
            return new yx8(h4f.n("video_conversions(ru.ok.tamtam.android.video.converter.VideoConversionDb).\n Expected:\n", mjeVar3, "\n Found:\n", mjeVarA3), false);
        }
        HashMap map4 = new HashMap(9);
        map4.put("latitude", new ije(0, 1, "latitude", "REAL", null, true));
        map4.put("longitude", new ije(0, 1, "longitude", "REAL", null, true));
        map4.put("altitude", new ije(0, 1, "altitude", "REAL", "0", true));
        map4.put("accuracy", new ije(0, 1, "accuracy", "REAL", "0", true));
        map4.put("bearing", new ije(0, 1, "bearing", "REAL", "0", true));
        map4.put("speed", new ije(0, 1, "speed", "REAL", "0", true));
        map4.put("device_id", new ije(0, 1, "device_id", "TEXT", null, true));
        map4.put("contact_server_id", new ije(1, 1, "contact_server_id", "INTEGER", null, true));
        mje mjeVar4 = new mje("contact_location", map4, h4f.o(map4, "time", new ije(2, 1, "time", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA4 = mje.a(k36Var, "contact_location");
        if (!mjeVar4.equals(mjeVarA4)) {
            return new yx8(h4f.n("contact_location(ru.ok.tamtam.android.location.live.model.ContactLocationDb).\n Expected:\n", mjeVar4, "\n Found:\n", mjeVarA4), false);
        }
        HashMap map5 = new HashMap(8);
        map5.put("message_time", new ije(0, 1, "message_time", "INTEGER", null, true));
        map5.put("live_period", new ije(0, 1, "live_period", "INTEGER", null, true));
        map5.put("start_time", new ije(0, 1, "start_time", "INTEGER", null, true));
        map5.put("end_time", new ije(0, 1, "end_time", "INTEGER", null, true));
        map5.put("device_id", new ije(0, 1, "device_id", "TEXT", null, true));
        map5.put("contact_server_id", new ije(1, 1, "contact_server_id", "INTEGER", null, true));
        map5.put("chat_id", new ije(2, 1, "chat_id", "INTEGER", null, true));
        mje mjeVar5 = new mje("chat_location", map5, h4f.o(map5, "message_id", new ije(3, 1, "message_id", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA5 = mje.a(k36Var, "chat_location");
        if (!mjeVar5.equals(mjeVarA5)) {
            return new yx8(h4f.n("chat_location(ru.ok.tamtam.android.location.live.model.ChatLocationDb).\n Expected:\n", mjeVar5, "\n Found:\n", mjeVarA5), false);
        }
        HashMap map6 = new HashMap(3);
        map6.put("conversation_id", new ije(1, 1, "conversation_id", "TEXT", null, true));
        map6.put(ApiProtocol.KEY_JOIN_LINK, new ije(0, 1, ApiProtocol.KEY_JOIN_LINK, "TEXT", null, true));
        mje mjeVar6 = new mje("call_links", map6, h4f.o(map6, "started_at", new ije(0, 1, "started_at", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA6 = mje.a(k36Var, "call_links");
        if (!mjeVar6.equals(mjeVarA6)) {
            return new yx8(h4f.n("call_links(ru.ok.tamtam.android.calls.links.db.CallLinkEntryDb).\n Expected:\n", mjeVar6, "\n Found:\n", mjeVarA6), false);
        }
        HashMap map7 = new HashMap(9);
        map7.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map7.put("name", new ije(0, 1, "name", "TEXT", null, false));
        map7.put("icon_url", new ije(0, 1, "icon_url", "TEXT", null, false));
        map7.put("author_id", new ije(0, 1, "author_id", "INTEGER", null, true));
        map7.put("created_time", new ije(0, 1, "created_time", "INTEGER", null, true));
        map7.put("updated_time", new ije(0, 1, "updated_time", "INTEGER", null, true));
        map7.put("link", new ije(0, 1, "link", "TEXT", null, true));
        map7.put("stickers", new ije(0, 1, "stickers", "TEXT", null, true));
        mje mjeVar7 = new mje("sticker_sets", map7, h4f.o(map7, "draft", new ije(0, 1, "draft", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA7 = mje.a(k36Var, "sticker_sets");
        if (!mjeVar7.equals(mjeVarA7)) {
            return new yx8(h4f.n("sticker_sets(ru.ok.tamtam.android.stickers.sets.StickerSetDb).\n Expected:\n", mjeVar7, "\n Found:\n", mjeVarA7), false);
        }
        HashMap map8 = new HashMap(2);
        map8.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        mje mjeVar8 = new mje("favorite_sticker_sets", map8, h4f.o(map8, "index", new ije(0, 1, "index", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA8 = mje.a(k36Var, "favorite_sticker_sets");
        if (!mjeVar8.equals(mjeVarA8)) {
            return new yx8(h4f.n("favorite_sticker_sets(ru.ok.tamtam.android.stickers.sets.favorite.FavoriteStickerSetDb).\n Expected:\n", mjeVar8, "\n Found:\n", mjeVarA8), false);
        }
        HashMap map9 = new HashMap(2);
        map9.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        mje mjeVar9 = new mje("favorite_stickers", map9, h4f.o(map9, "index", new ije(0, 1, "index", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA9 = mje.a(k36Var, "favorite_stickers");
        if (!mjeVar9.equals(mjeVarA9)) {
            return new yx8(h4f.n("favorite_stickers(ru.ok.tamtam.android.stickers.favorite.FavoriteStickerDb).\n Expected:\n", mjeVar9, "\n Found:\n", mjeVarA9), false);
        }
        HashMap map10 = new HashMap(8);
        map10.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map10.put("recent_type", new ije(0, 1, "recent_type", "INTEGER", null, true));
        map10.put("recent_time", new ije(0, 1, "recent_time", "INTEGER", null, true));
        map10.put("server_id", new ije(0, 1, "server_id", "INTEGER", "0", true));
        map10.put("sticker_id", new ije(0, 1, "sticker_id", "INTEGER", null, false));
        map10.put("emoji", new ije(0, 1, "emoji", "TEXT", null, false));
        map10.put("gif", new ije(0, 1, "gif", "BLOB", null, false));
        mje mjeVar10 = new mje("recent", map10, h4f.o(map10, "gif_id", new ije(0, 1, "gif_id", "INTEGER", null, false), 0), new HashSet(0));
        mje mjeVarA10 = mje.a(k36Var, "recent");
        if (!mjeVar10.equals(mjeVarA10)) {
            return new yx8(h4f.n("recent(ru.ok.tamtam.android.stickers.recents.RecentDb).\n Expected:\n", mjeVar10, "\n Found:\n", mjeVarA10), false);
        }
        HashMap map11 = new HashMap(2);
        map11.put("emoji", new ije(1, 1, "emoji", "TEXT", null, true));
        mje mjeVar11 = new mje("default_emoji", map11, h4f.o(map11, "default_value", new ije(0, 1, "default_value", "TEXT", null, true), 0), new HashSet(0));
        mje mjeVarA11 = mje.a(k36Var, "default_emoji");
        if (!mjeVar11.equals(mjeVarA11)) {
            return new yx8(h4f.n("default_emoji(ru.ok.tamtam.android.stickers.emoji.DefaultEmojiDb).\n Expected:\n", mjeVar11, "\n Found:\n", mjeVarA11), false);
        }
        HashMap map12 = new HashMap(13);
        map12.put("chat_id", new ije(1, 1, "chat_id", "INTEGER", null, true));
        map12.put("message_id", new ije(2, 1, "message_id", "INTEGER", null, true));
        map12.put("type", new ije(0, 1, "type", "TEXT", null, true));
        map12.put("chat_title", new ije(0, 1, "chat_title", "TEXT", null, false));
        map12.put("sender_user_name", new ije(0, 1, "sender_user_name", "TEXT", null, false));
        map12.put("sender_user_id", new ije(0, 1, "sender_user_id", "INTEGER", null, true));
        map12.put("time", new ije(0, 1, "time", "INTEGER", null, true));
        map12.put("text", new ije(0, 1, "text", "TEXT", null, true));
        map12.put("push_id", new ije(0, 1, "push_id", "INTEGER", null, true));
        map12.put("event_key", new ije(0, 1, "event_key", "TEXT", null, false));
        map12.put("large_image_url", new ije(0, 1, "large_image_url", "TEXT", "NULL", false));
        map12.put("fire_m", new ije(0, 1, "fire_m", "INTEGER", "0", true));
        mje mjeVar12 = new mje("fcm_notifications", map12, h4f.o(map12, "has_any_error", new ije(0, 1, "has_any_error", "INTEGER", "0", true), 0), new HashSet(0));
        mje mjeVarA12 = mje.a(k36Var, "fcm_notifications");
        if (!mjeVar12.equals(mjeVarA12)) {
            return new yx8(h4f.n("fcm_notifications(ru.ok.tamtam.android.notifications.messages.newpush.fcm.storage.model.FcmNotification).\n Expected:\n", mjeVar12, "\n Found:\n", mjeVarA12), false);
        }
        HashMap map13 = new HashMap(2);
        map13.put("chat_id", new ije(1, 1, "chat_id", "INTEGER", null, true));
        mje mjeVar13 = new mje("fcm_notifications_history", map13, h4f.o(map13, "last_notify_msg_id", new ije(0, 1, "last_notify_msg_id", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA13 = mje.a(k36Var, "fcm_notifications_history");
        if (!mjeVar13.equals(mjeVarA13)) {
            return new yx8(h4f.n("fcm_notifications_history(ru.ok.tamtam.android.notifications.messages.newpush.fcm.history.model.FcmNotificationHistoryDb).\n Expected:\n", mjeVar13, "\n Found:\n", mjeVarA13), false);
        }
        HashMap map14 = new HashMap(13);
        map14.put("push_id", new ije(0, 1, "push_id", "INTEGER", null, true));
        map14.put("chat_id", new ije(1, 1, "chat_id", "INTEGER", null, true));
        map14.put("msg_id", new ije(2, 1, "msg_id", "INTEGER", null, true));
        map14.put("analytics_status", new ije(0, 1, "analytics_status", "INTEGER", null, true));
        map14.put("suid", new ije(0, 1, "suid", "INTEGER", null, false));
        map14.put("content_length", new ije(0, 1, "content_length", "INTEGER", null, true));
        map14.put("sent_time", new ije(0, 1, "sent_time", "INTEGER", null, false));
        map14.put("event_key", new ije(0, 1, "event_key", "TEXT", null, false));
        map14.put("fcm_sent_time", new ije(0, 1, "fcm_sent_time", "INTEGER", null, true));
        map14.put("received_time", new ije(0, 1, "received_time", "INTEGER", null, true));
        map14.put("push_type", new ije(0, 1, "push_type", "TEXT", null, true));
        map14.put("time", new ije(0, 1, "time", "INTEGER", null, true));
        mje mjeVar14 = new mje("fcm_notifications_analytics", map14, h4f.o(map14, "created_time", new ije(0, 1, "created_time", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA14 = mje.a(k36Var, "fcm_notifications_analytics");
        if (!mjeVar14.equals(mjeVarA14)) {
            return new yx8(h4f.n("fcm_notifications_analytics(ru.ok.tamtam.android.notifications.messages.newpush.fcm.analytics.model.FcmAnalyticsEntryDb).\n Expected:\n", mjeVar14, "\n Found:\n", mjeVarA14), false);
        }
        HashMap map15 = new HashMap(2);
        map15.put("chat_id", new ije(1, 1, "chat_id", "INTEGER", null, true));
        mje mjeVar15 = new mje("notifications_read_marks", map15, h4f.o(map15, "mark", new ije(0, 1, "mark", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA15 = mje.a(k36Var, "notifications_read_marks");
        if (!mjeVar15.equals(mjeVarA15)) {
            return new yx8(h4f.n("notifications_read_marks(ru.ok.tamtam.android.notifications.messages.newpush.readmarks.model.NotificationReadMarkDb).\n Expected:\n", mjeVar15, "\n Found:\n", mjeVarA15), false);
        }
        HashMap map16 = new HashMap(5);
        map16.put("chat_id", new ije(2, 1, "chat_id", "INTEGER", null, true));
        map16.put("message_id", new ije(1, 1, "message_id", "INTEGER", null, true));
        map16.put("time", new ije(0, 1, "time", "INTEGER", null, true));
        map16.put("fcm", new ije(0, 1, "fcm", "INTEGER", null, false));
        mje mjeVar16 = new mje("notifications_tracker_messages", map16, h4f.o(map16, "drop_reason", new ije(0, 1, "drop_reason", "TEXT", null, false), 0), new HashSet(0));
        mje mjeVarA16 = mje.a(k36Var, "notifications_tracker_messages");
        if (!mjeVar16.equals(mjeVarA16)) {
            return new yx8(h4f.n("notifications_tracker_messages(ru.ok.tamtam.android.notifications.messages.tracker.storage.model.NotificationsTrackerMessageDb).\n Expected:\n", mjeVar16, "\n Found:\n", mjeVarA16), false);
        }
        HashMap map17 = new HashMap(9);
        map17.put(ClientCookie.PATH_ATTR, new ije(0, 1, ClientCookie.PATH_ATTR, "TEXT", null, true));
        map17.put("last_modified", new ije(0, 1, "last_modified", "INTEGER", null, true));
        map17.put("upload_type", new ije(0, 1, "upload_type", "INTEGER", null, true));
        map17.put("chat_id", new ije(1, 1, "chat_id", "INTEGER", null, true));
        map17.put("attach_id", new ije(2, 1, "attach_id", "TEXT", null, true));
        map17.put("video_quality", new ije(0, 1, "video_quality", "INTEGER", null, false));
        map17.put("video_start_trim_position", new ije(0, 1, "video_start_trim_position", "REAL", null, false));
        map17.put("video_end_trim_position", new ije(0, 1, "video_end_trim_position", "REAL", null, false));
        mje mjeVar17 = new mje("draft_uploads", map17, h4f.o(map17, "mute", new ije(0, 1, "mute", "INTEGER", "false", false), 0), new HashSet(0));
        mje mjeVarA17 = mje.a(k36Var, "draft_uploads");
        if (!mjeVar17.equals(mjeVarA17)) {
            return new yx8(h4f.n("draft_uploads(ru.ok.tamtam.android.upload.draft.DraftUploadDb).\n Expected:\n", mjeVar17, "\n Found:\n", mjeVarA17), false);
        }
        HashMap map18 = new HashMap(13);
        map18.put("id", new ije(1, 1, "id", "TEXT", null, true));
        map18.put("title", new ije(0, 1, "title", "TEXT", null, true));
        map18.put("emoji", new ije(0, 1, "emoji", "TEXT", "NULL", false));
        map18.put("order", new ije(0, 1, "order", "INTEGER", null, true));
        map18.put("filters", new ije(0, 1, "filters", "TEXT", null, true));
        map18.put("isHiddenForAllFolder", new ije(0, 1, "isHiddenForAllFolder", "INTEGER", null, true));
        map18.put("hideIfEmpty", new ije(0, 1, "hideIfEmpty", "INTEGER", "0", true));
        map18.put("elements", new ije(0, 1, "elements", "BLOB", "NULL", false));
        map18.put("creatorId", new ije(0, 1, "creatorId", "INTEGER", "NULL", false));
        map18.put("filterSubjects", new ije(0, 1, "filterSubjects", "BLOB", "NULL", false));
        map18.put("widgets", new ije(0, 1, "widgets", "BLOB", "NULL", false));
        map18.put("options", new ije(0, 1, "options", "BLOB", "NULL", false));
        HashSet hashSetO = h4f.o(map18, "isRemoved", new ije(0, 1, "isRemoved", "INTEGER", "0", true), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new lje("index_chat_folder_filters", false, Arrays.asList("filters"), Arrays.asList("ASC")));
        mje mjeVar18 = new mje("chat_folder", map18, hashSetO, hashSet);
        mje mjeVarA18 = mje.a(k36Var, "chat_folder");
        if (!mjeVar18.equals(mjeVarA18)) {
            return new yx8(h4f.n("chat_folder(ru.ok.tamtam.android.folders.db.RoomChatFolder).\n Expected:\n", mjeVar18, "\n Found:\n", mjeVarA18), false);
        }
        HashMap map19 = new HashMap(2);
        map19.put(ApiProtocol.PARAM_CHAT_ID, new ije(1, 1, ApiProtocol.PARAM_CHAT_ID, "INTEGER", null, true));
        mje mjeVar19 = new mje("folder_and_chats", map19, h4f.o(map19, "folderId", new ije(2, 1, "folderId", "TEXT", null, true), 0), new HashSet(0));
        mje mjeVarA19 = mje.a(k36Var, "folder_and_chats");
        if (!mjeVar19.equals(mjeVarA19)) {
            return new yx8(h4f.n("folder_and_chats(ru.ok.tamtam.android.folders.db.ChatAndFolderCrossRef).\n Expected:\n", mjeVar19, "\n Found:\n", mjeVarA19), false);
        }
        HashMap map20 = new HashMap(2);
        map20.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        mje mjeVar20 = new mje("selected_mentions", map20, h4f.o(map20, "selectedMentionType", new ije(0, 1, "selectedMentionType", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA20 = mje.a(k36Var, "selected_mentions");
        if (!mjeVar20.equals(mjeVarA20)) {
            return new yx8(h4f.n("selected_mentions(ru.ok.tamtam.mentions.SelectedMention).\n Expected:\n", mjeVar20, "\n Found:\n", mjeVarA20), false);
        }
        HashSet hashSet2 = new HashSet(5);
        hashSet2.add("normalizedTitle");
        hashSet2.add("originalTitle");
        hashSet2.add("normalizedTitleWithoutEmoji");
        hashSet2.add("originalTitleWithoutEmoji");
        hashSet2.add("sortTime");
        h56 h56Var = new h56("chat_title", hashSet2, "CREATE VIRTUAL TABLE IF NOT EXISTS `chat_title` USING FTS4(`normalizedTitle` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `normalizedTitleWithoutEmoji` TEXT, `originalTitleWithoutEmoji` TEXT, `sortTime` INTEGER NOT NULL)");
        h56 h56VarA = h56.a(k36Var, "chat_title");
        if (!h56Var.equals(h56VarA)) {
            return new yx8("chat_title(ru.ok.tamtam.android.chat.ChatTitle).\n Expected:\n" + h56Var + "\n Found:\n" + h56VarA, false);
        }
        HashSet hashSet3 = new HashSet(5);
        hashSet3.add("link");
        hashSet3.add("allNormalizedTitles");
        hashSet3.add("allOriginalTitles");
        hashSet3.add("allNormalizedTitlesWithoutEmoji");
        hashSet3.add("allOriginalTitlesWithoutEmoji");
        h56 h56Var2 = new h56("contact_title", hashSet3, "CREATE VIRTUAL TABLE IF NOT EXISTS `contact_title` USING FTS4(`link` TEXT NOT NULL, `allNormalizedTitles` TEXT NOT NULL, `allOriginalTitles` TEXT NOT NULL, `allNormalizedTitlesWithoutEmoji` TEXT, `allOriginalTitlesWithoutEmoji` TEXT)");
        h56 h56VarA2 = h56.a(k36Var, "contact_title");
        if (!h56Var2.equals(h56VarA2)) {
            return new yx8("contact_title(ru.ok.tamtam.android.contacts.ContactTitle).\n Expected:\n" + h56Var2 + "\n Found:\n" + h56VarA2, false);
        }
        HashMap map21 = new HashMap(33);
        map21.put("uuid", new ije(1, 1, "uuid", "TEXT", null, true));
        map21.put("uniqueWorkName", new ije(0, 1, "uniqueWorkName", "TEXT", null, true));
        map21.put("existingWorkPolicy", new ije(0, 1, "existingWorkPolicy", "TEXT", null, true));
        map21.put("tags", new ije(0, 1, "tags", "TEXT", null, true));
        map21.put("time", new ije(0, 1, "time", "INTEGER", null, true));
        map21.put("state", new ije(0, 1, "state", "INTEGER", "0", true));
        map21.put("work_spec_id", new ije(0, 1, "work_spec_id", "TEXT", null, true));
        map21.put("work_spec_state", new ije(0, 1, "work_spec_state", "INTEGER", null, true));
        map21.put("work_spec_worker_class_name", new ije(0, 1, "work_spec_worker_class_name", "TEXT", null, true));
        map21.put("work_spec_input_merger_class_name", new ije(0, 1, "work_spec_input_merger_class_name", "TEXT", null, false));
        map21.put("work_spec_input", new ije(0, 1, "work_spec_input", "BLOB", null, true));
        map21.put("work_spec_output", new ije(0, 1, "work_spec_output", "BLOB", null, true));
        map21.put("work_spec_initial_delay", new ije(0, 1, "work_spec_initial_delay", "INTEGER", null, true));
        map21.put("work_spec_interval_duration", new ije(0, 1, "work_spec_interval_duration", "INTEGER", null, true));
        map21.put("work_spec_flex_duration", new ije(0, 1, "work_spec_flex_duration", "INTEGER", null, true));
        map21.put("work_spec_run_attempt_count", new ije(0, 1, "work_spec_run_attempt_count", "INTEGER", null, true));
        map21.put("work_spec_backoff_policy", new ije(0, 1, "work_spec_backoff_policy", "INTEGER", null, true));
        map21.put("work_spec_backoff_delay_duration", new ije(0, 1, "work_spec_backoff_delay_duration", "INTEGER", null, true));
        map21.put("work_spec_last_enqueue_time", new ije(0, 1, "work_spec_last_enqueue_time", "INTEGER", null, true));
        map21.put("work_spec_minimum_retention_duration", new ije(0, 1, "work_spec_minimum_retention_duration", "INTEGER", null, true));
        map21.put("work_spec_schedule_requested_at", new ije(0, 1, "work_spec_schedule_requested_at", "INTEGER", null, true));
        map21.put("work_spec_run_in_foreground", new ije(0, 1, "work_spec_run_in_foreground", "INTEGER", null, true));
        map21.put("work_spec_out_of_quota_policy", new ije(0, 1, "work_spec_out_of_quota_policy", "INTEGER", null, true));
        map21.put("work_spec_period_count", new ije(0, 1, "work_spec_period_count", "INTEGER", "0", true));
        map21.put("work_spec_generation", new ije(0, 1, "work_spec_generation", "INTEGER", "0", true));
        map21.put("work_spec_required_network_type", new ije(0, 1, "work_spec_required_network_type", "INTEGER", null, true));
        map21.put("work_spec_requires_charging", new ije(0, 1, "work_spec_requires_charging", "INTEGER", null, true));
        map21.put("work_spec_requires_device_idle", new ije(0, 1, "work_spec_requires_device_idle", "INTEGER", null, true));
        map21.put("work_spec_requires_battery_not_low", new ije(0, 1, "work_spec_requires_battery_not_low", "INTEGER", null, true));
        map21.put("work_spec_requires_storage_not_low", new ije(0, 1, "work_spec_requires_storage_not_low", "INTEGER", null, true));
        map21.put("work_spec_trigger_content_update_delay", new ije(0, 1, "work_spec_trigger_content_update_delay", "INTEGER", null, true));
        map21.put("work_spec_trigger_max_content_delay", new ije(0, 1, "work_spec_trigger_max_content_delay", "INTEGER", null, true));
        HashSet hashSetO2 = h4f.o(map21, "work_spec_content_uri_triggers", new ije(0, 1, "work_spec_content_uri_triggers", "BLOB", null, true), 0);
        HashSet hashSet4 = new HashSet(4);
        hashSet4.add(new lje("index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration", true, Arrays.asList("uniqueWorkName", "work_spec_interval_duration"), Arrays.asList("ASC", "ASC")));
        hashSet4.add(new lje("index_WorkerQueueItem_work_spec_schedule_requested_at", false, Arrays.asList("work_spec_schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new lje("index_WorkerQueueItem_work_spec_last_enqueue_time", false, Arrays.asList("work_spec_last_enqueue_time"), Arrays.asList("ASC")));
        hashSet4.add(new lje("index_WorkerQueueItem_time", false, Arrays.asList("time"), Arrays.asList("ASC")));
        mje mjeVar21 = new mje("WorkerQueueItem", map21, hashSetO2, hashSet4);
        mje mjeVarA21 = mje.a(k36Var, "WorkerQueueItem");
        if (!mjeVar21.equals(mjeVarA21)) {
            return new yx8(h4f.n("WorkerQueueItem(androidx.work.impl.model.WorkerQueueItem).\n Expected:\n", mjeVar21, "\n Found:\n", mjeVarA21), false);
        }
        HashMap map22 = new HashMap(8);
        map22.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map22.put("type", new ije(0, 1, "type", "INTEGER", null, true));
        map22.put("status", new ije(0, 1, "status", "INTEGER", null, true));
        map22.put("fails_count", new ije(0, 1, "fails_count", "INTEGER", null, true));
        map22.put("depends_request_id", new ije(0, 1, "depends_request_id", "INTEGER", null, true));
        map22.put("dependency_type", new ije(0, 1, "dependency_type", "INTEGER", null, true));
        map22.put("data", new ije(0, 1, "data", "BLOB", null, true));
        mje mjeVar22 = new mje("tasks", map22, h4f.o(map22, "created_time", new ije(0, 1, "created_time", "INTEGER", null, true), 0), new HashSet(0));
        mje mjeVarA22 = mje.a(k36Var, "tasks");
        if (!mjeVar22.equals(mjeVarA22)) {
            return new yx8(h4f.n("tasks(one.me.sdk.tasks.db.TaskEntity).\n Expected:\n", mjeVar22, "\n Found:\n", mjeVarA22), false);
        }
        HashMap map23 = new HashMap(5);
        map23.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map23.put("server_id", new ije(0, 1, "server_id", "INTEGER", null, true));
        map23.put("presence", new ije(0, 1, "presence", "INTEGER", null, true));
        map23.put("presence_type", new ije(0, 1, "presence_type", "INTEGER", null, true));
        HashSet hashSetO3 = h4f.o(map23, "data", new ije(0, 1, "data", "BLOB", null, true), 0);
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new lje("index_contacts_server_id", false, Arrays.asList("server_id"), Arrays.asList("ASC")));
        mje mjeVar23 = new mje("contacts", map23, hashSetO3, hashSet5);
        mje mjeVarA23 = mje.a(k36Var, "contacts");
        if (!mjeVar23.equals(mjeVarA23)) {
            return new yx8(h4f.n("contacts(ru.ok.tamtam.android.contacts.db.ContactEntity).\n Expected:\n", mjeVar23, "\n Found:\n", mjeVarA23), false);
        }
        HashMap map24 = new HashMap(10);
        map24.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map24.put("phonebook_id", new ije(0, 1, "phonebook_id", "INTEGER", null, true));
        map24.put("contact_id", new ije(0, 1, "contact_id", "INTEGER", null, true));
        map24.put("phone", new ije(0, 1, "phone", "TEXT", null, true));
        map24.put("server_phone", new ije(0, 1, "server_phone", "INTEGER", null, true));
        map24.put("email", new ije(0, 1, "email", "TEXT", null, false));
        map24.put("first_name", new ije(0, 1, "first_name", "TEXT", null, true));
        map24.put("last_name", new ije(0, 1, "last_name", "TEXT", null, false));
        map24.put("avatar_path", new ije(0, 1, "avatar_path", "TEXT", null, false));
        HashSet hashSetO4 = h4f.o(map24, "type", new ije(0, 1, "type", "INTEGER", null, true), 0);
        HashSet hashSet6 = new HashSet(3);
        hashSet6.add(new lje("index_phones_phonebook_id", false, Arrays.asList("phonebook_id"), Arrays.asList("ASC")));
        hashSet6.add(new lje("index_phones_type", false, Arrays.asList("type"), Arrays.asList("ASC")));
        hashSet6.add(new lje("index_phones_server_phone", false, Arrays.asList("server_phone"), Arrays.asList("ASC")));
        mje mjeVar24 = new mje("phones", map24, hashSetO4, hashSet6);
        mje mjeVarA24 = mje.a(k36Var, "phones");
        if (!mjeVar24.equals(mjeVarA24)) {
            return new yx8(h4f.n("phones(ru.ok.tamtam.android.phone.PhoneEntity).\n Expected:\n", mjeVar24, "\n Found:\n", mjeVarA24), false);
        }
        HashMap map25 = new HashMap(4);
        map25.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map25.put("status", new ije(0, 1, "status", "INTEGER", null, true));
        map25.put("entry", new ije(0, 1, "entry", "BLOB", null, true));
        mje mjeVar25 = new mje("events", map25, h4f.o(map25, "isCritical", new ije(0, 1, "isCritical", "INTEGER", "0", true), 0), new HashSet(0));
        mje mjeVarA25 = mje.a(k36Var, "events");
        if (!mjeVar25.equals(mjeVarA25)) {
            return new yx8(h4f.n("events(ru.ok.tamtam.android.stats.StatEntity).\n Expected:\n", mjeVar25, "\n Found:\n", mjeVarA25), false);
        }
        HashMap map26 = new HashMap(16);
        map26.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map26.put("sticker_id", new ije(0, 1, "sticker_id", "INTEGER", null, true));
        map26.put("width", new ije(0, 1, "width", "INTEGER", null, true));
        map26.put("height", new ije(0, 1, "height", "INTEGER", null, true));
        map26.put("url", new ije(0, 1, "url", "TEXT", null, false));
        map26.put("update_time", new ije(0, 1, "update_time", "INTEGER", null, true));
        map26.put("mp4_url", new ije(0, 1, "mp4_url", "TEXT", null, false));
        map26.put("first_url", new ije(0, 1, "first_url", "TEXT", null, false));
        map26.put("preview_url", new ije(0, 1, "preview_url", "TEXT", null, false));
        map26.put("tags", new ije(0, 1, "tags", "TEXT", null, true));
        map26.put("sticker_type", new ije(0, 1, "sticker_type", "INTEGER", null, true));
        map26.put("set_id", new ije(0, 1, "set_id", "INTEGER", null, true));
        map26.put("lottie_url", new ije(0, 1, "lottie_url", "TEXT", null, false));
        map26.put(MediaStreamTrack.AUDIO_TRACK_KIND, new ije(0, 1, MediaStreamTrack.AUDIO_TRACK_KIND, "INTEGER", null, true));
        map26.put("author_type", new ije(0, 1, "author_type", "INTEGER", null, true));
        mje mjeVar26 = new mje("stickers", map26, h4f.o(map26, "video_url", new ije(0, 1, "video_url", "TEXT", null, false), 0), new HashSet(0));
        mje mjeVarA26 = mje.a(k36Var, "stickers");
        if (!mjeVar26.equals(mjeVarA26)) {
            return new yx8(h4f.n("stickers(ru.ok.tamtam.android.stickers.db.StickerEntity).\n Expected:\n", mjeVar26, "\n Found:\n", mjeVarA26), false);
        }
        HashMap map27 = new HashMap(6);
        map27.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map27.put("server_id", new ije(0, 1, "server_id", "INTEGER", null, true));
        map27.put("data", new ije(0, 1, "data", "BLOB", null, true));
        map27.put("favourite_index", new ije(0, 1, "favourite_index", "INTEGER", null, true));
        map27.put("sort_time", new ije(0, 1, "sort_time", "INTEGER", null, true));
        HashSet hashSetO5 = h4f.o(map27, "cid", new ije(0, 1, "cid", "INTEGER", "0", true), 0);
        HashSet hashSet7 = new HashSet(4);
        hashSet7.add(new lje("index_chats_server_id", false, Arrays.asList("server_id"), Arrays.asList("ASC")));
        hashSet7.add(new lje("index_chats_cid", false, Arrays.asList("cid"), Arrays.asList("ASC")));
        hashSet7.add(new lje("index_chats_favourite_index", false, Arrays.asList("favourite_index"), Arrays.asList("ASC")));
        hashSet7.add(new lje("index_chats_favourite_index_sort_time_id", false, Arrays.asList("favourite_index", "sort_time", "id"), Arrays.asList("ASC", "DESC", "DESC")));
        mje mjeVar27 = new mje("chats", map27, hashSetO5, hashSet7);
        mje mjeVarA27 = mje.a(k36Var, "chats");
        if (!mjeVar27.equals(mjeVarA27)) {
            return new yx8(h4f.n("chats(ru.ok.tamtam.android.chat.ChatEntity).\n Expected:\n", mjeVar27, "\n Found:\n", mjeVarA27), false);
        }
        HashMap map28 = new HashMap(36);
        map28.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map28.put("server_id", new ije(0, 1, "server_id", "INTEGER", null, true));
        map28.put("time", new ije(0, 1, "time", "INTEGER", null, true));
        map28.put("update_time", new ije(0, 1, "update_time", "INTEGER", null, true));
        map28.put("sender", new ije(0, 1, "sender", "INTEGER", null, true));
        map28.put("cid", new ije(0, 1, "cid", "INTEGER", null, true));
        map28.put("text", new ije(0, 1, "text", "TEXT", null, false));
        map28.put("delivery_status", new ije(0, 1, "delivery_status", "INTEGER", null, true));
        map28.put("status", new ije(0, 1, "status", "INTEGER", null, true));
        map28.put("time_local", new ije(0, 1, "time_local", "INTEGER", null, true));
        map28.put("error", new ije(0, 1, "error", "TEXT", null, false));
        map28.put("localized_error", new ije(0, 1, "localized_error", "TEXT", null, false));
        map28.put("attaches", new ije(0, 1, "attaches", "BLOB", null, false));
        map28.put("media_type", new ije(0, 1, "media_type", "INTEGER", null, true));
        map28.put("detect_share", new ije(0, 1, "detect_share", "INTEGER", null, true));
        map28.put("msg_link_type", new ije(0, 1, "msg_link_type", "INTEGER", null, true));
        map28.put("msg_link_id", new ije(0, 1, "msg_link_id", "INTEGER", null, true));
        map28.put("inserted_from_msg_link", new ije(0, 1, "inserted_from_msg_link", "INTEGER", null, true));
        map28.put("msg_link_chat_id", new ije(0, 1, "msg_link_chat_id", "INTEGER", null, true));
        map28.put("msg_link_chat_name", new ije(0, 1, "msg_link_chat_name", "TEXT", null, false));
        map28.put("msg_link_chat_link", new ije(0, 1, "msg_link_chat_link", "TEXT", null, false));
        map28.put("msg_link_out_chat_id", new ije(0, 1, "msg_link_out_chat_id", "INTEGER", null, true));
        map28.put("msg_link_out_msg_id", new ije(0, 1, "msg_link_out_msg_id", "INTEGER", null, true));
        map28.put("type", new ije(0, 1, "type", "INTEGER", null, true));
        map28.put("chat_id", new ije(0, 1, "chat_id", "INTEGER", null, true));
        map28.put("ttl", new ije(0, 1, "ttl", "INTEGER", null, true));
        map28.put("channel_views", new ije(0, 1, "channel_views", "INTEGER", null, true));
        map28.put("channel_forwards", new ije(0, 1, "channel_forwards", "INTEGER", null, true));
        map28.put("view_time", new ije(0, 1, "view_time", "INTEGER", null, true));
        map28.put("zoom", new ije(0, 1, "zoom", "INTEGER", null, true));
        map28.put("options", new ije(0, 1, "options", "INTEGER", null, true));
        map28.put("live_until", new ije(0, 1, "live_until", "INTEGER", null, true));
        map28.put("elements", new ije(0, 1, "elements", "BLOB", null, true));
        map28.put("reactions", new ije(0, 1, "reactions", "BLOB", null, false));
        map28.put("delayed_attrs_time_to_fire", new ije(0, 1, "delayed_attrs_time_to_fire", "INTEGER", null, false));
        HashSet hashSetO6 = h4f.o(map28, "delayed_attrs_notify_sender", new ije(0, 1, "delayed_attrs_notify_sender", "INTEGER", null, false), 1);
        hashSetO6.add(new jje("chats", "NO ACTION", "NO ACTION", Arrays.asList("chat_id"), Arrays.asList("id")));
        HashSet hashSet8 = new HashSet(6);
        hashSet8.add(new lje("index_messages_chat_id", false, Arrays.asList("chat_id"), Arrays.asList("ASC")));
        hashSet8.add(new lje("index_messages_cid", false, Arrays.asList("cid"), Arrays.asList("ASC")));
        hashSet8.add(new lje("index_messages_server_id", false, Arrays.asList("server_id"), Arrays.asList("ASC")));
        hashSet8.add(new lje("index_messages_chat_id_time", false, Arrays.asList("chat_id", "time"), Arrays.asList("ASC", "ASC")));
        hashSet8.add(new lje("index_messages_chat_id_media_type", false, Arrays.asList("chat_id", "media_type"), Arrays.asList("ASC", "ASC")));
        hashSet8.add(new lje("index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender", false, Arrays.asList("delayed_attrs_time_to_fire", "delayed_attrs_notify_sender"), Arrays.asList("ASC", "ASC")));
        mje mjeVar28 = new mje("messages", map28, hashSetO6, hashSet8);
        mje mjeVarA28 = mje.a(k36Var, "messages");
        if (!mjeVar28.equals(mjeVarA28)) {
            return new yx8(h4f.n("messages(ru.ok.tamtam.android.messages.MessageEntity).\n Expected:\n", mjeVar28, "\n Found:\n", mjeVarA28), false);
        }
        HashMap map29 = new HashMap(7);
        map29.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map29.put("update_time", new ije(0, 1, "update_time", "INTEGER", null, true));
        map29.put("emoji", new ije(0, 1, "emoji", "TEXT", null, true));
        map29.put("lottie_url", new ije(0, 1, "lottie_url", "TEXT", null, false));
        map29.put("lottie_play_url", new ije(0, 1, "lottie_play_url", "TEXT", null, false));
        map29.put("set_id", new ije(0, 1, "set_id", "INTEGER", null, false));
        mje mjeVar29 = new mje("animoji", map29, h4f.o(map29, "icon_url", new ije(0, 1, "icon_url", "TEXT", "NULL", false), 0), new HashSet(0));
        mje mjeVarA29 = mje.a(k36Var, "animoji");
        if (!mjeVar29.equals(mjeVarA29)) {
            return new yx8(h4f.n("animoji(ru.ok.tamtam.android.animoji.db.AnimojiEntity).\n Expected:\n", mjeVar29, "\n Found:\n", mjeVarA29), false);
        }
        HashMap map30 = new HashMap(6);
        map30.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map30.put("name", new ije(0, 1, "name", "TEXT", null, true));
        map30.put("icon_url", new ije(0, 1, "icon_url", "TEXT", null, true));
        map30.put("icon_lottie_url", new ije(0, 1, "icon_lottie_url", "TEXT", null, false));
        map30.put("update_time", new ije(0, 1, "update_time", "INTEGER", null, true));
        mje mjeVar30 = new mje("animoji_set", map30, h4f.o(map30, "animoji_ids", new ije(0, 1, "animoji_ids", "TEXT", null, true), 0), new HashSet(0));
        mje mjeVarA30 = mje.a(k36Var, "animoji_set");
        if (!mjeVar30.equals(mjeVarA30)) {
            return new yx8(h4f.n("animoji_set(ru.ok.tamtam.android.animoji.db.AnimojiSetEntity).\n Expected:\n", mjeVar30, "\n Found:\n", mjeVarA30), false);
        }
        HashMap map31 = new HashMap(3);
        map31.put("id", new ije(1, 1, "id", "TEXT", null, true));
        map31.put("update_time", new ije(0, 1, "update_time", "INTEGER", null, true));
        mje mjeVar31 = new mje("reactions_section", map31, h4f.o(map31, "reactions", new ije(0, 1, "reactions", "TEXT", null, true), 0), new HashSet(0));
        mje mjeVarA31 = mje.a(k36Var, "reactions_section");
        if (!mjeVar31.equals(mjeVarA31)) {
            return new yx8(h4f.n("reactions_section(ru.ok.tamtam.android.animoji.db.ReactionsSectionEntity).\n Expected:\n", mjeVar31, "\n Found:\n", mjeVarA31), false);
        }
        HashMap map32 = new HashMap(2);
        map32.put("user_id", new ije(1, 1, "user_id", "INTEGER", null, true));
        HashSet hashSetO7 = h4f.o(map32, "chat_id", new ije(0, 1, "chat_id", "INTEGER", null, true), 0);
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new lje("index_saved_msg_chat_chat_id", true, Arrays.asList("chat_id"), Arrays.asList("ASC")));
        mje mjeVar32 = new mje("saved_msg_chat", map32, hashSetO7, hashSet9);
        mje mjeVarA32 = mje.a(k36Var, "saved_msg_chat");
        if (!mjeVar32.equals(mjeVarA32)) {
            return new yx8(h4f.n("saved_msg_chat(ru.ok.tamtam.android.chat.SavedMessagesChatEntity).\n Expected:\n", mjeVar32, "\n Found:\n", mjeVarA32), false);
        }
        HashMap map33 = new HashMap(6);
        map33.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map33.put("user_id", new ije(0, 1, "user_id", "INTEGER", null, true));
        map33.put("bot_id", new ije(0, 1, "bot_id", "INTEGER", null, true));
        map33.put(ApiProtocol.KEY_TOKEN, new ije(0, 1, ApiProtocol.KEY_TOKEN, "TEXT", null, false));
        map33.put("access_requested", new ije(0, 1, "access_requested", "INTEGER", null, true));
        HashSet hashSetO8 = h4f.o(map33, "access_granted", new ije(0, 1, "access_granted", "INTEGER", null, true), 0);
        HashSet hashSet10 = new HashSet(2);
        hashSet10.add(new lje("index_webapp_biometry_user_id", false, Arrays.asList("user_id"), Arrays.asList("ASC")));
        hashSet10.add(new lje("index_webapp_biometry_bot_id", false, Arrays.asList("bot_id"), Arrays.asList("ASC")));
        mje mjeVar33 = new mje("webapp_biometry", map33, hashSetO8, hashSet10);
        mje mjeVarA33 = mje.a(k36Var, "webapp_biometry");
        if (!mjeVar33.equals(mjeVarA33)) {
            return new yx8(h4f.n("webapp_biometry(ru.ok.tamtam.android.webapp.WebAppBiometryEntity).\n Expected:\n", mjeVar33, "\n Found:\n", mjeVarA33), false);
        }
        HashMap map34 = new HashMap(3);
        map34.put("id", new ije(1, 1, "id", "INTEGER", null, true));
        map34.put("server_id", new ije(0, 1, "server_id", "INTEGER", null, true));
        HashSet hashSetO9 = h4f.o(map34, "profile", new ije(0, 1, "profile", "BLOB", null, true), 0);
        HashSet hashSet11 = new HashSet(1);
        hashSet11.add(new lje("index_profile_server_id", true, Arrays.asList("server_id"), Arrays.asList("ASC")));
        mje mjeVar34 = new mje("profile", map34, hashSetO9, hashSet11);
        mje mjeVarA34 = mje.a(k36Var, "profile");
        return !mjeVar34.equals(mjeVarA34) ? new yx8(h4f.n("profile(ru.ok.tamtam.android.profile.db.ProfileEntity).\n Expected:\n", mjeVar34, "\n Found:\n", mjeVarA34), false) : new yx8(null, true);
    }

    @Override // defpackage.oy
    public final void b(k36 k36Var) {
        switch (this.c) {
            case 0:
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `uploads` (`attach_local_id` TEXT, `prepared_path` TEXT, `file_name` TEXT, `upload_url` TEXT, `upload_progress` REAL NOT NULL, `total_bytes` INTEGER NOT NULL, `upload_status` INTEGER, `created_time` INTEGER NOT NULL, `path` TEXT NOT NULL, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER NOT NULL, `photo_token` TEXT, `attach_id` INTEGER, PRIMARY KEY(`path`, `last_modified`, `upload_type`))", "CREATE TABLE IF NOT EXISTS `message_uploads` (`path` TEXT, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER, `message_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `attach_id` TEXT NOT NULL, `video_quality` INTEGER, `video_start_trim_position` REAL, `video_end_trim_position` REAL, `mute` INTEGER DEFAULT false, PRIMARY KEY(`message_id`, `chat_id`, `attach_id`))", "CREATE TABLE IF NOT EXISTS `video_conversions` (`finished` INTEGER NOT NULL, `prepared_path` TEXT, `result_path` TEXT, `source_uri` TEXT NOT NULL, `quality` INTEGER NOT NULL, `start_trim_position` REAL NOT NULL, `end_trim_position` REAL NOT NULL, `mute` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`source_uri`, `quality`, `start_trim_position`, `end_trim_position`, `mute`))", "CREATE TABLE IF NOT EXISTS `contact_location` (`latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL DEFAULT 0, `accuracy` REAL NOT NULL DEFAULT 0, `bearing` REAL NOT NULL DEFAULT 0, `speed` REAL NOT NULL DEFAULT 0, `device_id` TEXT NOT NULL, `contact_server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`contact_server_id`, `time`))");
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `chat_location` (`message_time` INTEGER NOT NULL, `live_period` INTEGER NOT NULL, `start_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `device_id` TEXT NOT NULL, `contact_server_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, PRIMARY KEY(`contact_server_id`, `chat_id`, `message_id`))", "CREATE TABLE IF NOT EXISTS `call_links` (`conversation_id` TEXT NOT NULL, `join_link` TEXT NOT NULL, `started_at` INTEGER NOT NULL, PRIMARY KEY(`conversation_id`))", "CREATE TABLE IF NOT EXISTS `sticker_sets` (`id` INTEGER NOT NULL, `name` TEXT, `icon_url` TEXT, `author_id` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, `updated_time` INTEGER NOT NULL, `link` TEXT NOT NULL, `stickers` TEXT NOT NULL, `draft` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `favorite_sticker_sets` (`id` INTEGER NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `favorite_stickers` (`id` INTEGER NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `recent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `recent_type` INTEGER NOT NULL, `recent_time` INTEGER NOT NULL, `server_id` INTEGER NOT NULL DEFAULT 0, `sticker_id` INTEGER, `emoji` TEXT, `gif` BLOB, `gif_id` INTEGER)", "CREATE TABLE IF NOT EXISTS `default_emoji` (`emoji` TEXT NOT NULL, `default_value` TEXT NOT NULL, PRIMARY KEY(`emoji`))", "CREATE TABLE IF NOT EXISTS `fcm_notifications` (`chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `chat_title` TEXT, `sender_user_name` TEXT, `sender_user_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `text` TEXT NOT NULL, `push_id` INTEGER NOT NULL, `event_key` TEXT, `large_image_url` TEXT DEFAULT NULL, `fire_m` INTEGER NOT NULL DEFAULT 0, `has_any_error` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`chat_id`, `message_id`))");
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `fcm_notifications_history` (`chat_id` INTEGER NOT NULL, `last_notify_msg_id` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))", "CREATE TABLE IF NOT EXISTS `fcm_notifications_analytics` (`push_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `msg_id` INTEGER NOT NULL, `analytics_status` INTEGER NOT NULL, `suid` INTEGER, `content_length` INTEGER NOT NULL, `sent_time` INTEGER, `event_key` TEXT, `fcm_sent_time` INTEGER NOT NULL, `received_time` INTEGER NOT NULL, `push_type` TEXT NOT NULL, `time` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, PRIMARY KEY(`chat_id`, `msg_id`))", "CREATE TABLE IF NOT EXISTS `notifications_read_marks` (`chat_id` INTEGER NOT NULL, `mark` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))", "CREATE TABLE IF NOT EXISTS `notifications_tracker_messages` (`chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `fcm` INTEGER, `drop_reason` TEXT, PRIMARY KEY(`message_id`, `chat_id`))");
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `draft_uploads` (`path` TEXT NOT NULL, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `attach_id` TEXT NOT NULL, `video_quality` INTEGER, `video_start_trim_position` REAL, `video_end_trim_position` REAL, `mute` INTEGER DEFAULT false, PRIMARY KEY(`chat_id`, `attach_id`))", "CREATE TABLE IF NOT EXISTS `chat_folder` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `emoji` TEXT DEFAULT NULL, `order` INTEGER NOT NULL, `filters` TEXT NOT NULL, `isHiddenForAllFolder` INTEGER NOT NULL, `hideIfEmpty` INTEGER NOT NULL DEFAULT 0, `elements` BLOB DEFAULT NULL, `creatorId` INTEGER DEFAULT NULL, `filterSubjects` BLOB DEFAULT NULL, `widgets` BLOB DEFAULT NULL, `options` BLOB DEFAULT NULL, `isRemoved` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_chat_folder_filters` ON `chat_folder` (`filters`)", "CREATE TABLE IF NOT EXISTS `folder_and_chats` (`chatId` INTEGER NOT NULL, `folderId` TEXT NOT NULL, PRIMARY KEY(`chatId`, `folderId`))");
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `selected_mentions` (`id` INTEGER NOT NULL, `selectedMentionType` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE VIRTUAL TABLE IF NOT EXISTS `chat_title` USING FTS4(`normalizedTitle` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `normalizedTitleWithoutEmoji` TEXT, `originalTitleWithoutEmoji` TEXT, `sortTime` INTEGER NOT NULL)", "CREATE VIRTUAL TABLE IF NOT EXISTS `contact_title` USING FTS4(`link` TEXT NOT NULL, `allNormalizedTitles` TEXT NOT NULL, `allOriginalTitles` TEXT NOT NULL, `allNormalizedTitlesWithoutEmoji` TEXT, `allOriginalTitlesWithoutEmoji` TEXT)", "CREATE TABLE IF NOT EXISTS `WorkerQueueItem` (`uuid` TEXT NOT NULL, `uniqueWorkName` TEXT NOT NULL, `existingWorkPolicy` TEXT NOT NULL, `tags` TEXT NOT NULL, `time` INTEGER NOT NULL, `state` INTEGER NOT NULL DEFAULT 0, `work_spec_id` TEXT NOT NULL, `work_spec_state` INTEGER NOT NULL, `work_spec_worker_class_name` TEXT NOT NULL, `work_spec_input_merger_class_name` TEXT, `work_spec_input` BLOB NOT NULL, `work_spec_output` BLOB NOT NULL, `work_spec_initial_delay` INTEGER NOT NULL, `work_spec_interval_duration` INTEGER NOT NULL, `work_spec_flex_duration` INTEGER NOT NULL, `work_spec_run_attempt_count` INTEGER NOT NULL, `work_spec_backoff_policy` INTEGER NOT NULL, `work_spec_backoff_delay_duration` INTEGER NOT NULL, `work_spec_last_enqueue_time` INTEGER NOT NULL, `work_spec_minimum_retention_duration` INTEGER NOT NULL, `work_spec_schedule_requested_at` INTEGER NOT NULL, `work_spec_run_in_foreground` INTEGER NOT NULL, `work_spec_out_of_quota_policy` INTEGER NOT NULL, `work_spec_period_count` INTEGER NOT NULL DEFAULT 0, `work_spec_generation` INTEGER NOT NULL DEFAULT 0, `work_spec_required_network_type` INTEGER NOT NULL, `work_spec_requires_charging` INTEGER NOT NULL, `work_spec_requires_device_idle` INTEGER NOT NULL, `work_spec_requires_battery_not_low` INTEGER NOT NULL, `work_spec_requires_storage_not_low` INTEGER NOT NULL, `work_spec_trigger_content_update_delay` INTEGER NOT NULL, `work_spec_trigger_max_content_delay` INTEGER NOT NULL, `work_spec_content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`uuid`))");
                ey8.l(k36Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration` ON `WorkerQueueItem` (`uniqueWorkName`, `work_spec_interval_duration`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_schedule_requested_at` ON `WorkerQueueItem` (`work_spec_schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_last_enqueue_time` ON `WorkerQueueItem` (`work_spec_last_enqueue_time`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_time` ON `WorkerQueueItem` (`time`)");
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `tasks` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `status` INTEGER NOT NULL, `fails_count` INTEGER NOT NULL, `depends_request_id` INTEGER NOT NULL, `dependency_type` INTEGER NOT NULL, `data` BLOB NOT NULL, `created_time` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `presence` INTEGER NOT NULL, `presence_type` INTEGER NOT NULL, `data` BLOB NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_contacts_server_id` ON `contacts` (`server_id`)", "CREATE TABLE IF NOT EXISTS `phones` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `phonebook_id` INTEGER NOT NULL, `contact_id` INTEGER NOT NULL, `phone` TEXT NOT NULL, `server_phone` INTEGER NOT NULL, `email` TEXT, `first_name` TEXT NOT NULL, `last_name` TEXT, `avatar_path` TEXT, `type` INTEGER NOT NULL)");
                ey8.l(k36Var, "CREATE INDEX IF NOT EXISTS `index_phones_phonebook_id` ON `phones` (`phonebook_id`)", "CREATE INDEX IF NOT EXISTS `index_phones_type` ON `phones` (`type`)", "CREATE INDEX IF NOT EXISTS `index_phones_server_phone` ON `phones` (`server_phone`)", "CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `status` INTEGER NOT NULL, `entry` BLOB NOT NULL, `isCritical` INTEGER NOT NULL DEFAULT 0)");
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sticker_id` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `url` TEXT, `update_time` INTEGER NOT NULL, `mp4_url` TEXT, `first_url` TEXT, `preview_url` TEXT, `tags` TEXT NOT NULL, `sticker_type` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `lottie_url` TEXT, `audio` INTEGER NOT NULL, `author_type` INTEGER NOT NULL, `video_url` TEXT)", "CREATE TABLE IF NOT EXISTS `chats` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `data` BLOB NOT NULL, `favourite_index` INTEGER NOT NULL, `sort_time` INTEGER NOT NULL, `cid` INTEGER NOT NULL DEFAULT 0)", "CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)", "CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)");
                ey8.l(k36Var, "CREATE INDEX IF NOT EXISTS `index_chats_favourite_index` ON `chats` (`favourite_index`)", "CREATE INDEX IF NOT EXISTS `index_chats_favourite_index_sort_time_id` ON `chats` (`favourite_index` ASC, `sort_time` DESC, `id` DESC)", "CREATE TABLE IF NOT EXISTS `messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
                ey8.l(k36Var, "CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)", "CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                ey8.l(k36Var, "CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)", "CREATE TABLE IF NOT EXISTS `animoji` (`id` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `emoji` TEXT NOT NULL, `lottie_url` TEXT, `lottie_play_url` TEXT, `set_id` INTEGER, `icon_url` TEXT DEFAULT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `animoji_set` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `icon_lottie_url` TEXT, `update_time` INTEGER NOT NULL, `animoji_ids` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `reactions_section` (`id` TEXT NOT NULL, `update_time` INTEGER NOT NULL, `reactions` TEXT NOT NULL, PRIMARY KEY(`id`))");
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `saved_msg_chat` (`user_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, PRIMARY KEY(`user_id`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_saved_msg_chat_chat_id` ON `saved_msg_chat` (`chat_id`)", "CREATE TABLE IF NOT EXISTS `webapp_biometry` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` INTEGER NOT NULL, `bot_id` INTEGER NOT NULL, `token` TEXT, `access_requested` INTEGER NOT NULL, `access_granted` INTEGER NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_webapp_biometry_user_id` ON `webapp_biometry` (`user_id`)");
                ey8.l(k36Var, "CREATE INDEX IF NOT EXISTS `index_webapp_biometry_bot_id` ON `webapp_biometry` (`bot_id`)", "CREATE TABLE IF NOT EXISTS `profile` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `profile` BLOB NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_profile_server_id` ON `profile` (`server_id`)", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                k36Var.U("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f23a258b18fc08c44a6e0c456b946baa')");
                break;
            default:
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                ey8.l(k36Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                ey8.l(k36Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                k36Var.U("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                k36Var.U("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                k36Var.U("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                break;
        }
    }

    @Override // defpackage.oy
    public final void c(k36 k36Var) {
        switch (this.c) {
            case 0:
                ey8.l(k36Var, "DROP TABLE IF EXISTS `uploads`", "DROP TABLE IF EXISTS `message_uploads`", "DROP TABLE IF EXISTS `video_conversions`", "DROP TABLE IF EXISTS `contact_location`");
                ey8.l(k36Var, "DROP TABLE IF EXISTS `chat_location`", "DROP TABLE IF EXISTS `call_links`", "DROP TABLE IF EXISTS `sticker_sets`", "DROP TABLE IF EXISTS `favorite_sticker_sets`");
                ey8.l(k36Var, "DROP TABLE IF EXISTS `favorite_stickers`", "DROP TABLE IF EXISTS `recent`", "DROP TABLE IF EXISTS `default_emoji`", "DROP TABLE IF EXISTS `fcm_notifications`");
                ey8.l(k36Var, "DROP TABLE IF EXISTS `fcm_notifications_history`", "DROP TABLE IF EXISTS `fcm_notifications_analytics`", "DROP TABLE IF EXISTS `notifications_read_marks`", "DROP TABLE IF EXISTS `notifications_tracker_messages`");
                ey8.l(k36Var, "DROP TABLE IF EXISTS `draft_uploads`", "DROP TABLE IF EXISTS `chat_folder`", "DROP TABLE IF EXISTS `folder_and_chats`", "DROP TABLE IF EXISTS `selected_mentions`");
                ey8.l(k36Var, "DROP TABLE IF EXISTS `chat_title`", "DROP TABLE IF EXISTS `contact_title`", "DROP TABLE IF EXISTS `WorkerQueueItem`", "DROP TABLE IF EXISTS `tasks`");
                ey8.l(k36Var, "DROP TABLE IF EXISTS `contacts`", "DROP TABLE IF EXISTS `phones`", "DROP TABLE IF EXISTS `events`", "DROP TABLE IF EXISTS `stickers`");
                ey8.l(k36Var, "DROP TABLE IF EXISTS `chats`", "DROP TABLE IF EXISTS `messages`", "DROP TABLE IF EXISTS `animoji`", "DROP TABLE IF EXISTS `animoji_set`");
                ey8.l(k36Var, "DROP TABLE IF EXISTS `reactions_section`", "DROP TABLE IF EXISTS `saved_msg_chat`", "DROP TABLE IF EXISTS `webapp_biometry`", "DROP TABLE IF EXISTS `profile`");
                List list = ((OneMeRoomDatabase_Impl) this.o).g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((m23) it.next()).getClass();
                    }
                    break;
                }
                break;
            default:
                ey8.l(k36Var, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
                k36Var.U("DROP TABLE IF EXISTS `WorkName`");
                k36Var.U("DROP TABLE IF EXISTS `WorkProgress`");
                k36Var.U("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.o;
                List list2 = workDatabase_Impl.g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((m23) workDatabase_Impl.g.get(i)).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oy
    public final void n() {
        switch (this.c) {
            case 0:
                List list = ((OneMeRoomDatabase_Impl) this.o).g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((m23) it.next()).getClass();
                    }
                    break;
                }
                break;
            default:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.o;
                List list2 = workDatabase_Impl.g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((m23) workDatabase_Impl.g.get(i)).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oy
    public final void o(k36 k36Var) {
        switch (this.c) {
            case 0:
                ((OneMeRoomDatabase_Impl) this.o).a = k36Var;
                k36Var.U("PRAGMA foreign_keys = ON");
                ((OneMeRoomDatabase_Impl) this.o).m(k36Var);
                List list = ((OneMeRoomDatabase_Impl) this.o).g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((m23) it.next()).a(k36Var);
                    }
                    break;
                }
                break;
            default:
                ((WorkDatabase_Impl) this.o).a = k36Var;
                k36Var.U("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.o).m(k36Var);
                List list2 = ((WorkDatabase_Impl) this.o).g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((m23) ((WorkDatabase_Impl) this.o).g.get(i)).a(k36Var);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oy
    public final void q(k36 k36Var) {
        switch (this.c) {
            case 0:
                ngg.p(k36Var);
                break;
            default:
                ngg.p(k36Var);
                break;
        }
    }

    @Override // defpackage.oy
    public final yx8 r(k36 k36Var) {
        switch (this.c) {
            case 0:
                return v(k36Var);
            default:
                HashMap map = new HashMap(2);
                map.put("work_spec_id", new ije(1, 1, "work_spec_id", "TEXT", null, true));
                HashSet hashSetO = h4f.o(map, "prerequisite_id", new ije(2, 1, "prerequisite_id", "TEXT", null, true), 2);
                hashSetO.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSetO.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new lje("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                hashSet.add(new lje("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
                mje mjeVar = new mje("Dependency", map, hashSetO, hashSet);
                mje mjeVarA = mje.a(k36Var, "Dependency");
                if (!mjeVar.equals(mjeVarA)) {
                    return new yx8(h4f.n("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", mjeVar, "\n Found:\n", mjeVarA), false);
                }
                HashMap map2 = new HashMap(27);
                map2.put("id", new ije(1, 1, "id", "TEXT", null, true));
                map2.put("state", new ije(0, 1, "state", "INTEGER", null, true));
                map2.put("worker_class_name", new ije(0, 1, "worker_class_name", "TEXT", null, true));
                map2.put("input_merger_class_name", new ije(0, 1, "input_merger_class_name", "TEXT", null, false));
                map2.put("input", new ije(0, 1, "input", "BLOB", null, true));
                map2.put("output", new ije(0, 1, "output", "BLOB", null, true));
                map2.put("initial_delay", new ije(0, 1, "initial_delay", "INTEGER", null, true));
                map2.put("interval_duration", new ije(0, 1, "interval_duration", "INTEGER", null, true));
                map2.put("flex_duration", new ije(0, 1, "flex_duration", "INTEGER", null, true));
                map2.put("run_attempt_count", new ije(0, 1, "run_attempt_count", "INTEGER", null, true));
                map2.put("backoff_policy", new ije(0, 1, "backoff_policy", "INTEGER", null, true));
                map2.put("backoff_delay_duration", new ije(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                map2.put("last_enqueue_time", new ije(0, 1, "last_enqueue_time", "INTEGER", null, true));
                map2.put("minimum_retention_duration", new ije(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                map2.put("schedule_requested_at", new ije(0, 1, "schedule_requested_at", "INTEGER", null, true));
                map2.put("run_in_foreground", new ije(0, 1, "run_in_foreground", "INTEGER", null, true));
                map2.put("out_of_quota_policy", new ije(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                map2.put("period_count", new ije(0, 1, "period_count", "INTEGER", "0", true));
                map2.put("generation", new ije(0, 1, "generation", "INTEGER", "0", true));
                map2.put("required_network_type", new ije(0, 1, "required_network_type", "INTEGER", null, true));
                map2.put("requires_charging", new ije(0, 1, "requires_charging", "INTEGER", null, true));
                map2.put("requires_device_idle", new ije(0, 1, "requires_device_idle", "INTEGER", null, true));
                map2.put("requires_battery_not_low", new ije(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                map2.put("requires_storage_not_low", new ije(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                map2.put("trigger_content_update_delay", new ije(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                map2.put("trigger_max_content_delay", new ije(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                HashSet hashSetO2 = h4f.o(map2, "content_uri_triggers", new ije(0, 1, "content_uri_triggers", "BLOB", null, true), 0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new lje("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
                hashSet2.add(new lje("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
                mje mjeVar2 = new mje("WorkSpec", map2, hashSetO2, hashSet2);
                mje mjeVarA2 = mje.a(k36Var, "WorkSpec");
                if (!mjeVar2.equals(mjeVarA2)) {
                    return new yx8(h4f.n("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", mjeVar2, "\n Found:\n", mjeVarA2), false);
                }
                HashMap map3 = new HashMap(2);
                map3.put("tag", new ije(1, 1, "tag", "TEXT", null, true));
                HashSet hashSetO3 = h4f.o(map3, "work_spec_id", new ije(2, 1, "work_spec_id", "TEXT", null, true), 1);
                hashSetO3.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new lje("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                mje mjeVar3 = new mje("WorkTag", map3, hashSetO3, hashSet3);
                mje mjeVarA3 = mje.a(k36Var, "WorkTag");
                if (!mjeVar3.equals(mjeVarA3)) {
                    return new yx8(h4f.n("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", mjeVar3, "\n Found:\n", mjeVarA3), false);
                }
                HashMap map4 = new HashMap(3);
                map4.put("work_spec_id", new ije(1, 1, "work_spec_id", "TEXT", null, true));
                map4.put("generation", new ije(2, 1, "generation", "INTEGER", "0", true));
                HashSet hashSetO4 = h4f.o(map4, "system_id", new ije(0, 1, "system_id", "INTEGER", null, true), 1);
                hashSetO4.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                mje mjeVar4 = new mje("SystemIdInfo", map4, hashSetO4, new HashSet(0));
                mje mjeVarA4 = mje.a(k36Var, "SystemIdInfo");
                if (!mjeVar4.equals(mjeVarA4)) {
                    return new yx8(h4f.n("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", mjeVar4, "\n Found:\n", mjeVarA4), false);
                }
                HashMap map5 = new HashMap(2);
                map5.put("name", new ije(1, 1, "name", "TEXT", null, true));
                HashSet hashSetO5 = h4f.o(map5, "work_spec_id", new ije(2, 1, "work_spec_id", "TEXT", null, true), 1);
                hashSetO5.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new lje("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                mje mjeVar5 = new mje("WorkName", map5, hashSetO5, hashSet4);
                mje mjeVarA5 = mje.a(k36Var, "WorkName");
                if (!mjeVar5.equals(mjeVarA5)) {
                    return new yx8(h4f.n("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", mjeVar5, "\n Found:\n", mjeVarA5), false);
                }
                HashMap map6 = new HashMap(2);
                map6.put("work_spec_id", new ije(1, 1, "work_spec_id", "TEXT", null, true));
                HashSet hashSetO6 = h4f.o(map6, "progress", new ije(0, 1, "progress", "BLOB", null, true), 1);
                hashSetO6.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                mje mjeVar6 = new mje("WorkProgress", map6, hashSetO6, new HashSet(0));
                mje mjeVarA6 = mje.a(k36Var, "WorkProgress");
                if (!mjeVar6.equals(mjeVarA6)) {
                    return new yx8(h4f.n("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", mjeVar6, "\n Found:\n", mjeVarA6), false);
                }
                HashMap map7 = new HashMap(2);
                map7.put("key", new ije(1, 1, "key", "TEXT", null, true));
                mje mjeVar7 = new mje("Preference", map7, h4f.o(map7, "long_value", new ije(0, 1, "long_value", "INTEGER", null, false), 0), new HashSet(0));
                mje mjeVarA7 = mje.a(k36Var, "Preference");
                return !mjeVar7.equals(mjeVarA7) ? new yx8(h4f.n("Preference(androidx.work.impl.model.Preference).\n Expected:\n", mjeVar7, "\n Found:\n", mjeVarA7), false) : new yx8(null, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfa(OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl) {
        super(15, 5);
        this.o = oneMeRoomDatabase_Impl;
    }
}
