def call()
{
  def content = libraryResource "bash.sh"
  writeFile file: "bash_script.sh" , text:content
  sh "ls -a ./bash_script.sh"
  sh "bash ./bash_script.sh"
}
