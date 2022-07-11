package com.example.mvvmkotlinexample.model

import com.google.gson.annotations.SerializedName


data class IssuesDataClass(
    @SerializedName("url") var url: String? = null,
    @SerializedName("repository_url") var repositoryUrl: String? = null,
    @SerializedName("labels_url") var labelsUrl: String? = null,
    @SerializedName("comments_url") var commentsUrl: String? = null,
    @SerializedName("events_url") var eventsUrl: String? = null,
    @SerializedName("html_url") var htmlUrl: String? = null,
    @SerializedName("id") var id: Int? = null,
    @SerializedName("node_id") var nodeId: String? = null,
    @SerializedName("number") var number: Int? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("user") var user: User? = User(),
    @SerializedName("labels") var labels: ArrayList<Labels> = arrayListOf(),
    @SerializedName("state") var state: String? = null,
    @SerializedName("locked") var locked: Boolean? = null,
    @SerializedName("assignee") var assignee: Assignee? = null,
    @SerializedName("assignees") var assignees: ArrayList<Assignee> = arrayListOf(),
    @SerializedName("milestone") var milestone: MileStone? = null,
    @SerializedName("comments") var comments: Int? = null,
    @SerializedName("created_at") var createdAt: String? = null,
    @SerializedName("updated_at") var updatedAt: String? = null,
    @SerializedName("closed_at") var closedAt: String? = null,
    @SerializedName("author_association") var authorAssociation: String? = null,
    @SerializedName("active_lock_reason") var activeLockReason: String? = null,
    @SerializedName("body") var body: String? = null,
    @SerializedName("reactions") var reactions: Reactions? = Reactions(),
    @SerializedName("timeline_url") var timelineUrl: String? = null,
    @SerializedName("performed_via_github_app") var performedViaGithubApp: String? = null,
    @SerializedName("state_reason") var stateReason: String? = null,
    @SerializedName("draft") var draft: Boolean? = null,
    @SerializedName("pull_request") var pullRequest: PullRequest? = PullRequest()
) {
    data class PullRequest(
        @SerializedName("url") var url: String? = null,
        @SerializedName("html_url") var htmlUrl: String? = null,
        @SerializedName("diff_url") var diffUrl: String? = null,
        @SerializedName("patch_url") var patchUrl: String? = null,
        @SerializedName("merged_at") var mergedAt: String? = null

    )

    data class MileStone (

        @SerializedName("url"           ) var url          : String?  = null,
        @SerializedName("html_url"      ) var htmlUrl      : String?  = null,
        @SerializedName("labels_url"    ) var labelsUrl    : String?  = null,
        @SerializedName("id"            ) var id           : Int?     = null,
        @SerializedName("node_id"       ) var nodeId       : String?  = null,
        @SerializedName("number"        ) var number       : Int?     = null,
        @SerializedName("title"         ) var title        : String?  = null,
        @SerializedName("description"   ) var description  : String?  = null,
        @SerializedName("creator"       ) var creator      : Creator? = Creator(),
        @SerializedName("open_issues"   ) var openIssues   : Int?     = null,
        @SerializedName("closed_issues" ) var closedIssues : Int?     = null,
        @SerializedName("state"         ) var state        : String?  = null,
        @SerializedName("created_at"    ) var createdAt    : String?  = null,
        @SerializedName("updated_at"    ) var updatedAt    : String?  = null,
        @SerializedName("due_on"        ) var dueOn        : String?  = null,
        @SerializedName("closed_at"     ) var closedAt     : String?  = null
    )

    data class Creator (
        @SerializedName("login"               ) var login             : String?  = null,
        @SerializedName("id"                  ) var id                : Int?     = null,
        @SerializedName("node_id"             ) var nodeId            : String?  = null,
        @SerializedName("avatar_url"          ) var avatarUrl         : String?  = null,
        @SerializedName("gravatar_id"         ) var gravatarId        : String?  = null,
        @SerializedName("url"                 ) var url               : String?  = null,
        @SerializedName("html_url"            ) var htmlUrl           : String?  = null,
        @SerializedName("followers_url"       ) var followersUrl      : String?  = null,
        @SerializedName("following_url"       ) var followingUrl      : String?  = null,
        @SerializedName("gists_url"           ) var gistsUrl          : String?  = null,
        @SerializedName("starred_url"         ) var starredUrl        : String?  = null,
        @SerializedName("subscriptions_url"   ) var subscriptionsUrl  : String?  = null,
        @SerializedName("organizations_url"   ) var organizationsUrl  : String?  = null,
        @SerializedName("repos_url"           ) var reposUrl          : String?  = null,
        @SerializedName("events_url"          ) var eventsUrl         : String?  = null,
        @SerializedName("received_events_url" ) var receivedEventsUrl : String?  = null,
        @SerializedName("type"                ) var type              : String?  = null,
        @SerializedName("site_admin"          ) var siteAdmin         : Boolean? = null
    )
    data class Assignee (
        @SerializedName("login"               ) var login             : String?  = null,
        @SerializedName("id"                  ) var id                : Int?     = null,
        @SerializedName("node_id"             ) var nodeId            : String?  = null,
        @SerializedName("avatar_url"          ) var avatarUrl         : String?  = null,
        @SerializedName("gravatar_id"         ) var gravatarId        : String?  = null,
        @SerializedName("url"                 ) var url               : String?  = null,
        @SerializedName("html_url"            ) var htmlUrl           : String?  = null,
        @SerializedName("followers_url"       ) var followersUrl      : String?  = null,
        @SerializedName("following_url"       ) var followingUrl      : String?  = null,
        @SerializedName("gists_url"           ) var gistsUrl          : String?  = null,
        @SerializedName("starred_url"         ) var starredUrl        : String?  = null,
        @SerializedName("subscriptions_url"   ) var subscriptionsUrl  : String?  = null,
        @SerializedName("organizations_url"   ) var organizationsUrl  : String?  = null,
        @SerializedName("repos_url"           ) var reposUrl          : String?  = null,
        @SerializedName("events_url"          ) var eventsUrl         : String?  = null,
        @SerializedName("received_events_url" ) var receivedEventsUrl : String?  = null,
        @SerializedName("type"                ) var type              : String?  = null,
        @SerializedName("site_admin"          ) var siteAdmin         : Boolean? = null
    )

}