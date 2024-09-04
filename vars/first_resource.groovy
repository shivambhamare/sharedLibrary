def call(name)
{
  sh "date"
  sh "echo Hi from the devops team"
  echo "$(name)"
}
