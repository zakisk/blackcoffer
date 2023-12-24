package com.blackcoffer.ui.explore_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.blackcoffer.ui.theme.Elephant
import com.blackcoffer.ui.theme.LocalSpacing
import com.blackcoffer.ui.theme.Tiber
import com.blackcoffer.utils.User
import com.blackcoffer.utils.fakeUsers

@Composable
fun UserItem(user: User) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(LocalSpacing.current.small)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = LocalSpacing.current.medium),
            shape = RoundedCornerShape(16.dp),
            elevation = 2.dp
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                    Text(
                        text = if (user.isInvited) "PENDING" else "+ INVITE",
                        color = if (user.isInvited) Color.Gray else Color.Tiber,
                        modifier = Modifier
                            .padding(
                                end = LocalSpacing.current.small,
                                top = LocalSpacing.current.small
                            ),
                        style = MaterialTheme.typography.labelLarge.copy(fontWeight = FontWeight.Bold)
                    )
                }

                Text(
                    text = user.name,
                    color = Color.Tiber,
                    modifier = Modifier.padding(
                        start = 80.dp,
                        top = LocalSpacing.current.small
                    ),
                    style = MaterialTheme.typography.labelLarge
                )

                Text(
                    text = "${user.location}, within ${user.within}Km",
                    color = Color.Elephant,
                    modifier = Modifier.padding(
                        start = 80.dp,
                        top = LocalSpacing.current.small
                    ),
                    style = MaterialTheme.typography.labelMedium
                )

                LinearProgressIndicator(
                    progress = .6F,
                    modifier = Modifier
                        .padding(
                            start = 80.dp,
                            end = LocalSpacing.current.medium,
                            top = LocalSpacing.current.small
                        )
                        .height(16.dp),
                    color = Color.Tiber,
                    trackColor = Color.Gray.copy(alpha = .1F),
                    strokeCap = StrokeCap.Round
                )

                Spacer(modifier = Modifier.height(LocalSpacing.current.large))

                Text(
                    text = user.hobbies.joinToString(separator = " | "),
                    color = Color.Elephant,
                    modifier = Modifier.padding(
                        start = LocalSpacing.current.medium,
                        top = LocalSpacing.current.small
                    ),
                    style = MaterialTheme.typography.labelMedium
                )

                Text(
                    text = user.description,
                    color = Color.Elephant,
                    modifier = Modifier.padding(
                        top = LocalSpacing.current.extraSmall,
                        start = LocalSpacing.current.medium,
                        bottom = LocalSpacing.current.small
                    ),
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }

        AsyncImage(
            modifier = Modifier
                .padding(top = LocalSpacing.current.large)
                .clip(RoundedCornerShape(8.dp))
                .size(width = 80.dp, height = 88.dp),
            model = user.profileImage,
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
    }
}

@Preview
@Composable
fun UserItemPreview() {
    UserItem(user = fakeUsers[0])
}

